package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class quizSVIIPCh1Answers extends AppCompatActivity {

    private ImageButton backbutton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sviipch1_answers);
        backbutton7= findViewById(R.id.backbutton7);
        backbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent( quizSVIIPCh1Answers.this, quizSVIIP.class);
                startActivity(intent);

            }
        });
    }
}