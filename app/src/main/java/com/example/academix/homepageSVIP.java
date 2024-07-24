package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class homepageSVIP extends AppCompatActivity {
    private Button materialbutton1;
    private Button videobutton1;
    private Button quizbutton1;
    private Button notesbutton1;
    private Button todobutton1;
    private ImageButton  imagebackbutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_homepage_svip);

        materialbutton1= findViewById(R.id.materialbutton1);
        materialbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIP.this, studymaterialSVIP.class);
                startActivity(intent);

            }
        });
        videobutton1= findViewById(R.id.videobutton1);
        videobutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIP.this, videosSVIP.class);
                startActivity(intent);

            }
        });

        quizbutton1= findViewById(R.id.quizbutton1);
        quizbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIP.this, quizSVIP.class);
                startActivity(intent);

            }
        });
        notesbutton1= findViewById(R.id.notesbutton1);
        notesbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIP.this, NotesMainActivity.class);
                startActivity(intent);

            }
        });
        todobutton1= findViewById(R.id.todobutton1);
        todobutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIP.this, ToDoSVI.class);
                startActivity(intent);

            }
        });
        imagebackbutton1= findViewById(R.id.imagebackbutton1);
        imagebackbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIP.this, studentselect.class);
                startActivity(intent);

            }
        });
    }
}