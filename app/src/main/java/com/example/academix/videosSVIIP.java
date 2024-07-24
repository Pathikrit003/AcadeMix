package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class videosSVIIP extends AppCompatActivity {
    private Button homebutton8;
    private Button todobutton12;
    private Button  videobuttonsviipch1;
    private Button  videobuttonsviipch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_videos_sviip);

        homebutton8= findViewById(R.id.homebutton8);
        homebutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIIP.this, homepageSVIIP.class);
                startActivity(intent);

            }
        });
        todobutton12= findViewById(R.id.todobutton12);
        todobutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIIP.this, ToDoSVII.class);
                startActivity(intent);

            }
        });
        videobuttonsviipch1= findViewById(R.id.videobuttonsviipch1);

        videobuttonsviipch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIIP.this, videosSVIIPCh1.class);
                startActivity(intent);

            }
        });
        videobuttonsviipch2= findViewById(R.id.videobuttonsviipch2);

        videobuttonsviipch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIIP.this, videosSVIIPCh2.class);
                startActivity(intent);

            }
        });
    }
}