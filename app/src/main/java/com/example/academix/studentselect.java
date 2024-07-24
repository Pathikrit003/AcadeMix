package com.example.academix;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class studentselect extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentselect);

         Spinner spinner1= findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.class_option, R.layout.color_spinner_layout);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedOption = parent.getItemAtPosition(position).toString();

        // Perform action based on the selected option
        if (selectedOption.equals("CLASS VI")) {
            // Start the new activity for Class VI
            Intent intent = new Intent(studentselect.this, studentsubjectselect.class);
            startActivity(intent);
        } else if (selectedOption.equals("CLASS VII")) {
            // Start the new activity for Class VII
            Intent intent = new Intent(studentselect.this, studentsubjectselect2.class);
            startActivity(intent);
        }
        // Add more conditions as needed
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Handle the case when no item is selected
    }
}
