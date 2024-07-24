package com.example.academix;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class teachersubjectselect extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachersubjectselect);

        Spinner spinner5= findViewById(R.id.spinner5);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.subject_option3, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter);

        spinner5.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedOption = parent.getItemAtPosition(position).toString();

        // Perform action based on the selected option
        if (selectedOption.equals("PHYSICS")) {
            // Start the new activity for Class VI
            Intent intent = new Intent(teachersubjectselect.this,homepageTVIP.class);
            startActivity(intent);
        } else if (selectedOption.equals("COMPUTER")) {
            // Start the new activity for Class VII
            Intent intent = new Intent(teachersubjectselect.this, homepageTVIC.class);
            startActivity(intent);
        }
        // Add more conditions as needed
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Handle the case when no item is selected
    }
}
