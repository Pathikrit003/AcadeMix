package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class studymaterialSVIC extends AppCompatActivity {
    private Button homebutton4;
    private Button chapter1buttonsc6sm;
    private Button chapter2buttonsc6sm;
    private Button todobutton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_studymaterial_svic);

        homebutton4= findViewById(R.id.homebutton4);
        homebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIC.this, homepageSVIC.class);
                startActivity(intent);

            }
        });
        chapter1buttonsc6sm= findViewById(R.id.chapter1buttonsc6sm);
        chapter1buttonsc6sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIC.this,studymaterialSVICCh1.class);
                startActivity(intent);

            }
        });
        chapter2buttonsc6sm= findViewById(R.id.chapter2buttonsc6sm);
        chapter2buttonsc6sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIC.this,studymaterialSVICCh2.class);
                startActivity(intent);

            }
        });
        todobutton6= findViewById(R.id.todobutton6);
        todobutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIC.this, ToDoSVI.class);
                startActivity(intent);

            }
        });
    }
}