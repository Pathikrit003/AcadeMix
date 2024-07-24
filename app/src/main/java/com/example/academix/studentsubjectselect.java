package com.example.academix;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class studentsubjectselect extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentsubjectselect);

        Spinner spinner3= findViewById(R.id.spinner3);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.subject_option1, R.layout.color_spinner_layout);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);

        spinner3.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedOption = parent.getItemAtPosition(position).toString();

        // Perform action based on the selected option
        if (selectedOption.equals("PHYSICS")) {
            // Start the new activity for Class VI
            Intent intent = new Intent(studentsubjectselect.this, homepageSVIP.class);
            startActivity(intent);
        } else if (selectedOption.equals("COMPUTER")) {
            // Start the new activity for Class VII
            Intent intent = new Intent(studentsubjectselect.this, homepageSVIC.class);
            startActivity(intent);
        }
        // Add more conditions as needed
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Handle the case when no item is selected
    }
}
