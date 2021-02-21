package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class EndGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.endgame);
        Intent intent=getIntent();
        int scoreValue=intent.getIntExtra("scoreValue",0);

        //TextView scorePrompt=(TextView) findViewById(R.id.scorePrompt);
        TextView actualScore=(TextView) findViewById(R.id.actualScore);
        actualScore.setText(String.valueOf(scoreValue));
    }
}