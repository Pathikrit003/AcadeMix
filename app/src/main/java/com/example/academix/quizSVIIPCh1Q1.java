package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIIPCh1Q1 extends AppCompatActivity {

    private Button nextbuttonsviipquizq1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sviipch1_q1);

        nextbuttonsviipquizq1= findViewById(R.id.nextbuttonsviipquizq1);
        nextbuttonsviipquizq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIIPCh1Q1.this, quizSVIIPCh1Q2.class);
                startActivity(intent);

            }
        });
    }
}