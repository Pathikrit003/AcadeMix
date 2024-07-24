package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class videosSVIIC extends AppCompatActivity {
    private Button homebutton11;
    private Button todobutton15;
    private Button  videobuttonsviicch1;
    private Button  videobuttonsviicch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_videos_sviic);

        homebutton11= findViewById(R.id.homebutton11);
        homebutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIIC.this, homepageSVIIC.class);
                startActivity(intent);

            }
        });
        todobutton15= findViewById(R.id.todobutton15);
        todobutton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIIC.this, ToDoSVII.class);
                startActivity(intent);

            }
        });
        videobuttonsviicch1= findViewById(R.id.videobuttonsviicch1);
        videobuttonsviicch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIIC.this, videosSVIICCh1.class);
                startActivity(intent);

            }
        });
        videobuttonsviicch2= findViewById(R.id.videobuttonsviicch2);
        videobuttonsviicch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIIC.this, videosSVIICCh2.class);
                startActivity(intent);

            }
        });
    }
}