package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class studymaterialSVIIP extends AppCompatActivity {
    private Button homebutton7;
    private Button todobutton11;
    private Button chapter1buttonsp7sm;
    private Button chapter2buttonsp7sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_studymaterial_sviip);

        homebutton7= findViewById(R.id.homebutton7);
        homebutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIIP.this, homepageSVIIP.class);
                startActivity(intent);

            }
        });
        todobutton11= findViewById(R.id.todobutton11);
        todobutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIIP.this, ToDoSVII.class);
                startActivity(intent);

            }
        });
        chapter1buttonsp7sm= findViewById(R.id.chapter1buttonsp7sm);
        chapter1buttonsp7sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIIP.this,studymaterialSVIIPCh1.class);
                startActivity(intent);

            }
        });
        chapter2buttonsp7sm= findViewById(R.id.chapter2buttonsp7sm);
        chapter2buttonsp7sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIIP.this,studymaterialSVIIPCh2.class);
                startActivity(intent);

            }
        });
    }
}