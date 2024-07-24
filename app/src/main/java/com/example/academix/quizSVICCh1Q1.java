package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVICCh1Q1 extends AppCompatActivity {

    private Button nextbuttonsvicquizq1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svicch1_q1);

        nextbuttonsvicquizq1= findViewById(R.id.nextbuttonsvicquizq1);
        nextbuttonsvicquizq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVICCh1Q1.this, quizSVICCh1Q2.class);
                startActivity(intent);

            }
        });
    }
}