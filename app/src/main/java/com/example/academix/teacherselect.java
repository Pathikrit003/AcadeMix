 package com.example.academix;


 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.AdapterView;
 import android.widget.ArrayAdapter;
 import android.widget.Spinner;

 import androidx.appcompat.app.AppCompatActivity;

 public class teacherselect extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacherselect);

        Spinner spinner2= findViewById(R.id.spinner2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.education_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);

        spinner2.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedOption = parent.getItemAtPosition(position).toString();

        // Perform action based on the selected option
        if (selectedOption.equals("GRADUATE")) {

            Intent intent = new Intent(teacherselect.this, teacherclassSelect.class);
            startActivity(intent);
        } else if (selectedOption.equals("NOT GRADUATE")) {

            Intent intent = new Intent(teacherselect.this, teacherclassSelect.class);
            startActivity(intent);
        }
        else if (selectedOption.equals("MASTERS")) {

            Intent intent = new Intent(teacherselect.this, teacherclassSelect.class);
            startActivity(intent);
        }
        else if (selectedOption.equals("PHD")) {

            Intent intent = new Intent(teacherselect.this,  teacherclassSelect.class);
            startActivity(intent);
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Handle the case when no item is selected
    }
}
