package com.example.alejandro.calcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class Temas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button b1 = findViewById(R.id.quiz1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data.actualQuiz=1;
                lauchQuiz();
            }
        });

        Button b2 = findViewById(R.id.quiz2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data.actualQuiz=2;
                lauchQuiz();
            }
        });
        Button b3 = findViewById(R.id.quiz3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data.actualQuiz=3;
                lauchQuiz();
            }
        });
    }

    private void lauchQuiz(){
        Intent sig = new Intent(Temas.this,MainActivity.class);
        startActivity(sig);
    }
}
