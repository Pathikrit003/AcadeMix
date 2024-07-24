package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIIPCh2Answers extends AppCompatActivity {

    private ImageButton backbutton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sviipch2_answers);
        backbutton8= findViewById(R.id.backbutton8);
        backbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIIPCh2Answers.this, quizSVIIP.class);
                startActivity(intent);

            }
        });
    }
}