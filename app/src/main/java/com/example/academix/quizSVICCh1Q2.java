package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVICCh1Q2 extends AppCompatActivity {

    private Button submitbuttonsvicch1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svicch1_q2);

        submitbuttonsvicch1= findViewById(R.id.submitbuttonsvicch1);
        submitbuttonsvicch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVICCh1Q2.this, quizSVICCh1Answers.class);
                startActivity(intent);

            }
        });
    }
}