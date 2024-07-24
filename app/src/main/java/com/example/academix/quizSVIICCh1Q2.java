package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIICCh1Q2 extends AppCompatActivity {
    private Button submitbuttonsviicch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sviicch1_q2);
        submitbuttonsviicch1= findViewById(R.id.submitbuttonsviicch1);
        submitbuttonsviicch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIICCh1Q2.this, quizSVIICCh1Answers.class);
                startActivity(intent);

            }
        });
    }
}