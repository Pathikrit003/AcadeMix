package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIICCh2Q2 extends AppCompatActivity {
private Button  submitbuttonsviicch2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sviicch2_q2);
        submitbuttonsviicch2= findViewById(R.id.submitbuttonsviicch2);
        submitbuttonsviicch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIICCh2Q2.this, quizSVIICCh2Answers.class);
                startActivity(intent);

            }
        });
    }
}