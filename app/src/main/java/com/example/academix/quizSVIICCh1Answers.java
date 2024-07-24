package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIICCh1Answers extends AppCompatActivity {
private ImageButton  backbutton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sviicch1_answers);
        backbutton5= findViewById(R.id.backbutton5);
        backbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIICCh1Answers.this, quizSVIIC.class);
                startActivity(intent);

            }
        });
    }
}