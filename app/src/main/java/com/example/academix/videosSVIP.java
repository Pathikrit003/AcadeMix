package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class videosSVIP extends AppCompatActivity {
    private Button homebutton2;
    private Button todobutton4;
    private Button videobuttonsvipch1;
    private Button videobuttonsvipch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_videos_svip);

        homebutton2= findViewById(R.id.homebutton2);
        homebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIP.this, homepageSVIP.class);
                startActivity(intent);

            }
        });
        todobutton4= findViewById(R.id.todobutton4);
        todobutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIP.this, ToDoSVI.class);
                startActivity(intent);

            }
        });

        videobuttonsvipch1= findViewById(R.id.videobuttonsvipch1);

        videobuttonsvipch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIP.this, videosSVIPCh1.class);
                startActivity(intent);

            }
        });
        videobuttonsvipch2= findViewById(R.id.videobuttonsvipch2);

        videobuttonsvipch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIP.this, videosSVIPCh2.class);
                startActivity(intent);

            }
        });
    }
}