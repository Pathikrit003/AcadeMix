package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIICCh1Q1 extends AppCompatActivity {

    private Button  nextbuttonsviicquizq1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sviicch1_q1);
        nextbuttonsviicquizq1= findViewById(R.id.nextbuttonsviicquizq1);
        nextbuttonsviicquizq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIICCh1Q1.this, quizSVIICCh1Q2.class);
                startActivity(intent);

            }
        });
    }
}