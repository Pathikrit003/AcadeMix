package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVICCh2Q2 extends AppCompatActivity {

    private Button submitbuttonsvicch2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svicch2_q2);

        submitbuttonsvicch2= findViewById(R.id.submitbuttonsvicch2);
        submitbuttonsvicch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVICCh2Q2.this, quizSVICCh2Answers.class);
                startActivity(intent);

            }
        });
    }

    public static class quizSVICCh1Answers extends AppCompatActivity {

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
}