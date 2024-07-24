package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIIPCh2Q1 extends AppCompatActivity {
private Button nextbuttonsviipquizch2q1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sviipch2_q1);
        nextbuttonsviipquizch2q1= findViewById(R.id.nextbuttonsviipquizch2q1);
        nextbuttonsviipquizch2q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIIPCh2Q1.this, quizSVIIPCh2Q2.class);
                startActivity(intent);

            }
        });
    }
}