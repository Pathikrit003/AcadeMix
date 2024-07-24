package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class quizSVIPCh2Answers extends AppCompatActivity {

    private ImageButton backbutton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_svipch2_answers);

        backbutton2= findViewById(R.id.backbutton2);
        backbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIPCh2Answers.this, quizSVIP.class);
                startActivity(intent);

            }
        });
    }
}