package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIPCh2Q1 extends AppCompatActivity {

    private Button nextbuttonsvipquizch2q1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svipch2_q1);

        nextbuttonsvipquizch2q1= findViewById(R.id.nextbuttonsvipquizch2q1);
        nextbuttonsvipquizch2q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIPCh2Q1.this, quizSVIPCh2Q2.class);
                startActivity(intent);

            }
        });
    }
}