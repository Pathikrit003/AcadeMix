package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVICCh2Answers extends AppCompatActivity {

    private ImageButton backbutton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svicch2_answers);

        backbutton4= findViewById(R.id.backbutton4);
        backbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVICCh2Answers.this, quizSVIC.class);
                startActivity(intent);

            }
        });
    }
}