package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class studymaterialSVIP extends AppCompatActivity {
    private Button homebutton1;
    private Button chapter1buttonsp6sm;
    private Button chapter2buttonsp6sm;
    private Button todobutton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_studymaterial_svip);

        homebutton1= findViewById(R.id.homebutton1);
        homebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIP.this, homepageSVIP.class);
                startActivity(intent);

            }
        });
        chapter1buttonsp6sm= findViewById(R.id.chapter1buttonsp6sm);
        chapter1buttonsp6sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIP.this,studymaterialSVIPCh1.class);
                startActivity(intent);

            }
        });
        chapter2buttonsp6sm= findViewById(R.id.chapter2buttonsp6sm);
        chapter2buttonsp6sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIP.this,studymaterialSVIPCh2.class);
                startActivity(intent);

            }
        });
        todobutton3= findViewById(R.id.todobutton3);
        todobutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIP.this, ToDoSVI.class);
                startActivity(intent);

            }
        });
    }
}