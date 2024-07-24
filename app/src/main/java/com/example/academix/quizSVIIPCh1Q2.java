package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIIPCh1Q2 extends AppCompatActivity {

    private Button submitbuttonsviipch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sviipch1_q2);

        submitbuttonsviipch1= findViewById(R.id.submitbuttonsviipch1);
        submitbuttonsviipch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIIPCh1Q2.this, quizSVIIPCh1Answers.class);
                startActivity(intent);

            }
        });
    }
}