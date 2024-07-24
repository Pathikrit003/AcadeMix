package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVIPCh2Q2 extends AppCompatActivity {

    private Button submitbuttonsvipch2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svipch2_q2);

        submitbuttonsvipch2= findViewById(R.id.submitbuttonsvipch2);
        submitbuttonsvipch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIPCh2Q2.this, quizSVIPCh2Answers.class);
                startActivity(intent);

            }
        });
    }
}