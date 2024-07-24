package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIIPCh2Q2 extends AppCompatActivity {
    private Button submitbuttonsviipch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sviipch2_q2);
        submitbuttonsviipch2= findViewById(R.id.submitbuttonsviipch2);
        submitbuttonsviipch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIIPCh2Q2.this, quizSVIIPCh2Answers.class);
                startActivity(intent);

            }
        });
    }
}