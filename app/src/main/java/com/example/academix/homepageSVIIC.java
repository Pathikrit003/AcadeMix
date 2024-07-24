package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class homepageSVIIC extends AppCompatActivity {
    private Button materialbutton4;
    private Button videobutton4;
    private Button quizbutton4;
    private Button notesbutton4;
    private Button todobutton10;
    private ImageButton imagebackbutton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_homepage_sviic);

        materialbutton4= findViewById(R.id.materialbutton4);
        materialbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIC.this, studymaterialSVIIC.class);
                startActivity(intent);

            }
        });
        videobutton4= findViewById(R.id.videobutton4);
        videobutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIC.this, videosSVIIC.class);
                startActivity(intent);

            }
        });
        quizbutton4= findViewById(R.id.quizbutton4);
        quizbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIC.this, quizSVIIC.class);
                startActivity(intent);

            }
        });
        notesbutton4= findViewById(R.id.notesbutton4);
        notesbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIC.this, NotesMainActivity.class);
                startActivity(intent);

            }
        });
        todobutton10= findViewById(R.id.todobutton10);
        todobutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIC.this, ToDoSVII.class);
                startActivity(intent);

            }
        });
        imagebackbutton4= findViewById(R.id.imagebackbutton4);
        imagebackbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(homepageSVIIC.this, studentselect.class);
                startActivity(intent);

            }
        });
    }
}