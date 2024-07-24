package com.example.academix;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ToDoSVII extends AppCompatActivity {

    private EditText newTaskInput;
    private LinearLayout taskContainer;
    private ArrayList<CheckBox> checkBoxList;
    private File taskFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_svii);

        // Find views by their IDs
        newTaskInput = findViewById(R.id.new_task_input);
        taskContainer = findViewById(R.id.task_container);
        checkBoxList = new ArrayList<>();
        taskFile = new File(getFilesDir(), "task_data1.txt");

        Button addTaskButton = findViewById(R.id.add_task_button);
        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTaskToList();
            }
        });

        Button deleteButton = findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDeleteButtonClicked();
            }
        });

        // Restore tasks from file
        restoreTasks();
    }

    private void addTaskToList() {
        String newTask = newTaskInput.getText().toString();

        if (!newTask.isEmpty()) {
            // Create a new LinearLayout to hold the checkbox and editable task
            LinearLayout taskLayout = new LinearLayout(this);
            taskLayout.setOrientation(LinearLayout.HORIZONTAL);

            // Create a new CheckBox
            CheckBox checkBox = new CheckBox(this);
            checkBoxList.add(checkBox);
            taskLayout.addView(checkBox);

            // Create a new EditText for the task
            EditText taskEditText = new EditText(this);
            taskEditText.setText(newTask);
            taskEditText.setTextColor(Color.BLACK);
            taskLayout.addView(taskEditText);

            taskContainer.addView(taskLayout);

            // Save the task to file
            saveTasks();

            // Clear the input field
            newTaskInput.setText("");
        }
    }

    private void onDeleteButtonClicked() {
        // Remove the checkboxes that are checked
        for (int i = checkBoxList.size() - 1; i >= 0; i--) {
            CheckBox checkBox = checkBoxList.get(i);
            if (checkBox.isChecked()) {
                LinearLayout taskLayout = (LinearLayout) checkBox.getParent();
                taskContainer.removeView(taskLayout);
                checkBoxList.remove(checkBox);
            }
        }
        saveTasks();
    }

    private void saveTasks() {
        try {
            FileOutputStream fos = new FileOutputStream(taskFile);
            for (int i = 0; i < taskContainer.getChildCount(); i++) {
                LinearLayout taskLayout = (LinearLayout) taskContainer.getChildAt(i);
                EditText taskEditText = (EditText) taskLayout.getChildAt(1);
                String task = taskEditText.getText().toString() + "\n";
                fos.write(task.getBytes());
            }
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void restoreTasks() {
        try {
            FileInputStream fis = new FileInputStream(taskFile);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                LinearLayout taskLayout = new LinearLayout(this);
                taskLayout.setOrientation(LinearLayout.HORIZONTAL);

                CheckBox checkBox = new CheckBox(this);
                checkBoxList.add(checkBox);
                taskLayout.addView(checkBox);

                EditText taskEditText = new EditText(this);
                taskEditText.setText(line);

                taskEditText.setTextColor(Color.BLACK);
                taskLayout.addView(taskEditText);

                taskContainer.addView(taskLayout);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
