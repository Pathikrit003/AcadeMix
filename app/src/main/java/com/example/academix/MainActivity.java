package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button teacherchoice;
    private Button studentchoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        teacherchoice = findViewById(R.id.teacherchoice);
        studentchoice = findViewById(R.id.studentchoice);
        teacherchoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(MainActivity.this, teacherselect.class);
                startActivity(intent);

            }
        });
        studentchoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(MainActivity.this, studentselect.class);
                startActivity(intent);

            }
        });
    }
}