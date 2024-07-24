package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVIC extends AppCompatActivity {
    private Button homebutton6;
    private Button  quizch1buttonsvic;
    private Button  quizch2buttonsvic;
    private Button  todobutton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svic);

        quizch1buttonsvic= findViewById(R.id.quizch1buttonsvic);
        quizch1buttonsvic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIC.this, quizSVICCh1Q1.class);
                startActivity(intent);

            }
        });
        quizch2buttonsvic= findViewById(R.id.quizch2buttonsvic);
        quizch2buttonsvic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIC.this, quizSVICCh2Q1.class);
                startActivity(intent);

            }
        });

        homebutton6= findViewById(R.id.homebutton6);
        homebutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIC.this, homepageSVIC.class);
                startActivity(intent);

            }
        });
        todobutton8= findViewById(R.id.todobutton8);
        todobutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIC.this, ToDoSVI.class);
                startActivity(intent);

            }
        });

    }
}