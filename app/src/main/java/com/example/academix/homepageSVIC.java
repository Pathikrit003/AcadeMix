package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class homepageSVIC extends AppCompatActivity {
    private Button materialbutton2;
    private Button videobutton2;
    private Button quizbutton2;
    private Button notesbutton2;
    private Button todobutton2;
    private ImageButton imagebackbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_homepage_svic);

        materialbutton2= findViewById(R.id.materialbutton2);
        materialbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIC.this, studymaterialSVIC.class);
                startActivity(intent);

            }
        });
        videobutton2= findViewById(R.id.videobutton2);
        videobutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIC.this, videosSVIC.class);
                startActivity(intent);

            }
        });

        quizbutton2= findViewById(R.id.quizbutton2);
        quizbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIC.this, quizSVIC.class);
                startActivity(intent);

            }
        });
        notesbutton2= findViewById(R.id.notesbutton2);
        notesbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIC.this, NotesMainActivity.class);
                startActivity(intent);

            }
        });
        todobutton2= findViewById(R.id.todobutton2);
        todobutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIC.this, ToDoSVI.class);
                startActivity(intent);

            }
        });
        imagebackbutton2= findViewById(R.id.imagebackbutton2);
        imagebackbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIC.this, studentselect.class);
                startActivity(intent);

            }
        });
    }
}