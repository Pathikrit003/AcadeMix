package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class videosSVIC extends AppCompatActivity {
    private Button homebutton5;
    private Button todobutton7;
    private Button videobuttonsvicch1;
    private Button videobuttonsvicch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_videos_svic);

        homebutton5= findViewById(R.id.homebutton5);
        homebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIC.this, homepageSVIC.class);
                startActivity(intent);

            }
        });
        todobutton7= findViewById(R.id.todobutton7);
        todobutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIC.this, ToDoSVI.class);
                startActivity(intent);

            }
        });
        videobuttonsvicch1= findViewById(R.id.videobuttonsvicch1);
        videobuttonsvicch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIC.this, videosSVICCh1.class);
                startActivity(intent);

            }
        });
        videobuttonsvicch2= findViewById(R.id.videobuttonsvicch2);
        videobuttonsvicch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(videosSVIC.this, videosSVICCh2.class);
                startActivity(intent);

            }
        });
    }
}