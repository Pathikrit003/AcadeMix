package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIPCh1Q1 extends AppCompatActivity {

    private Button nextbuttonsvipquizq1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svipch1_q1);

        nextbuttonsvipquizq1= findViewById(R.id.nextbuttonsvipquizq1);
        nextbuttonsvipquizq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIPCh1Q1.this, quizSVIPCh1Q2.class);
                startActivity(intent);

            }
        });
    }
}