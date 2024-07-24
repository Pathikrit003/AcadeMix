package com.example.academix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class studymaterialSVIIC extends AppCompatActivity {
    private Button homebutton10;
    private Button todobutton14;
    private Button chapter1buttonsc7sm;
    private Button chapter2buttonsc7sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_studymaterial_sviic);

        homebutton10= findViewById(R.id.homebutton10);
        homebutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIIC.this, homepageSVIIC.class);
                startActivity(intent);

            }
        });
        todobutton14= findViewById(R.id.todobutton14);
        todobutton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIIC.this, ToDoSVII.class);
                startActivity(intent);

            }
        });
        chapter1buttonsc7sm= findViewById(R.id.chapter1buttonsc7sm);
        chapter1buttonsc7sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIIC.this,studymaterialSVIICCh1.class);
                startActivity(intent);

            }
        });
        chapter2buttonsc7sm= findViewById(R.id.chapter2buttonsc7sm);
        chapter2buttonsc7sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packageContext;
                Intent intent = new Intent(studymaterialSVIIC.this,studymaterialSVIICCh2.class);
                startActivity(intent);

            }
        });
    }
}