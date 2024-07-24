package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVIP extends AppCompatActivity {
    private Button homebutton3;
    private Button quizch1buttonsvip;
    private Button quizch2buttonsvip;
    private Button todobutton5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svip);

        quizch1buttonsvip= findViewById(R.id.quizch1buttonsvip);
        quizch1buttonsvip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIP.this, quizSVIPCh1Q1.class);
                startActivity(intent);

            }
        });
        quizch2buttonsvip= findViewById(R.id.quizch2buttonsvip);
        quizch2buttonsvip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIP.this, quizSVIPCh2Q1.class);
                startActivity(intent);

            }
        });
        homebutton3= findViewById(R.id.homebutton3);
        homebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIP.this, homepageSVIP.class);
                startActivity(intent);

            }
        });
        todobutton5= findViewById(R.id.todobutton5);
        todobutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIP.this, ToDoSVI.class);
                startActivity(intent);

            }
        });
    }
}