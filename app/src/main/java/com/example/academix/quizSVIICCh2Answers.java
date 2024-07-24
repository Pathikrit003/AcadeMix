package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIICCh2Answers extends AppCompatActivity {

    private ImageButton backbutton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sviicch2_answers);
        backbutton6= findViewById(R.id.backbutton6);
        backbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIICCh2Answers.this, quizSVIIC.class);
                startActivity(intent);

            }
        });
    }
}