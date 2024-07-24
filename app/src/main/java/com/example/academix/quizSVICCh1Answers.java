package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVICCh1Answers extends AppCompatActivity {

    private ImageButton backbutton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svicch1_answers);

        backbutton3= findViewById(R.id.backbutton3);
        backbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVICCh1Answers.this, quizSVIC.class);
                startActivity(intent);

            }
        });
    }
}