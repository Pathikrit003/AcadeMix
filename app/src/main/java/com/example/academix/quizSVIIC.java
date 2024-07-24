package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVIIC extends AppCompatActivity {
    private Button homebutton12;
    private Button todobutton16;
    private Button quizch1buttonsviic;
    private Button quizch2buttonsviic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_sviic);

        homebutton12= findViewById(R.id.homebutton12);
        homebutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIIC.this, homepageSVIIC.class);
                startActivity(intent);

            }
        });
        todobutton16= findViewById(R.id.todobutton16);
        todobutton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIIC.this, ToDoSVII.class);
                startActivity(intent);

            }
        });
        quizch1buttonsviic= findViewById(R.id.quizch1buttonsviic);
        quizch1buttonsviic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIIC.this, quizSVIICCh1Q1.class);
                startActivity(intent);

            }
        });
        quizch2buttonsviic= findViewById(R.id.quizch2buttonsviic);
        quizch2buttonsviic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(quizSVIIC.this, quizSVIICCh2Q1.class);
                startActivity(intent);

            }
        });
    }
}