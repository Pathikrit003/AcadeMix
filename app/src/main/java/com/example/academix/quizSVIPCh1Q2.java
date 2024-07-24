package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVIPCh1Q2 extends AppCompatActivity {

    private Button submitbuttonsvipch1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svipch1_q2);

        submitbuttonsvipch1= findViewById(R.id.submitbuttonsvipch1);
        submitbuttonsvipch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIPCh1Q2.this, quizSVIPCh1Answers.class);
                startActivity(intent);

            }
        });
    }
}