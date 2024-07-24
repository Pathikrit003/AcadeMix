package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class homepageSVIIP extends AppCompatActivity {
    private Button materialbutton3;
    private Button videobutton3;
    private Button quizbutton3;
    private Button notesbutton3;
    private Button todobutton9;
    private ImageButton imagebackbutton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_homepage_sviip);

        materialbutton3= findViewById(R.id.materialbutton3);
        materialbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIP.this, studymaterialSVIIP.class);
                startActivity(intent);

            }
        });
        videobutton3= findViewById(R.id.videobutton3);
        videobutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIP.this, videosSVIIP.class);
                startActivity(intent);

            }
        });
        quizbutton3= findViewById(R.id.quizbutton3);
        quizbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIP.this, quizSVIIP.class);
                startActivity(intent);

            }
        });
        notesbutton3= findViewById(R.id.notesbutton3);
        notesbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIP.this, NotesMainActivity.class);
                startActivity(intent);

            }
        });
        todobutton9= findViewById(R.id.todobutton9);
        todobutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIP.this, ToDoSVII.class);
                startActivity(intent);

            }
        });
        imagebackbutton3= findViewById(R.id.imagebackbutton3);
        imagebackbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIP.this, studentselect.class);
                startActivity(intent);

            }
        });

    }
}