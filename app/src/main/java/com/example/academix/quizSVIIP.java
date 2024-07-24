package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVIIP extends AppCompatActivity {
    private Button homebutton9;
    private Button todobutton13;
    private Button quizch1buttonsviip;
    private Button quizch2buttonsviip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_sviip);

        homebutton9= findViewById(R.id.homebutton9);
        homebutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIIP.this, homepageSVIIP.class);
                startActivity(intent);

            }
        });
        todobutton13= findViewById(R.id.todobutton13);
        todobutton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIIP.this, ToDoSVII.class);
                startActivity(intent);

            }
        });
        quizch1buttonsviip= findViewById(R.id.quizch1buttonsviip);
        quizch1buttonsviip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIIP.this, quizSVIIPCh1Q1.class);
                startActivity(intent);

            }
        });
        quizch2buttonsviip= findViewById(R.id.quizch2buttonsviip);
        quizch2buttonsviip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIIP.this, quizSVIIPCh2Q1.class);
                startActivity(intent);

            }
        });
    }
}