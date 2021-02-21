package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button answer1,answer2,answer3,answer4;
    TextView score,question;
    int scoreValue=0;
    Quiz quiz=new Quiz();
    boolean testValid=true;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent=new Intent(this,EndGame.class);
        answer1=(Button) findViewById(R.id.answer1);
        answer1.setOnClickListener(this);
        answer2=(Button) findViewById(R.id.answer2);
        answer2.setOnClickListener(this);
        answer3=(Button) findViewById(R.id.answer3);
        answer3.setOnClickListener(this);
        answer4=(Button) findViewById(R.id.answer4);
        answer4.setOnClickListener(this);

        score=(TextView) findViewById(R.id.score);
        question=(TextView) findViewById(R.id.question);
        setupQuestion();


    }

public void setupQuestion(){
    
    score.setText("Score: "+String.valueOf(scoreValue));
    question.setText(quiz.myQuestions[quiz.getquestionweAreOn()].getName());
    String[] choicesClone=quiz.myQuestions[quiz.getquestionweAreOn()].getChoices();
    answer1.setText(choicesClone[0]);
    answer2.setText(choicesClone[1]);
    answer3.setText(choicesClone[2]);
    answer4.setText(choicesClone[3]);
}

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case(R.id.answer1):
                if(answer1.getText()==quiz.myQuestions[quiz.getquestionweAreOn()].getAnswer() && testValid){
                    scoreValue+=5;
                    scoreUpdate();


                }
                if(quiz.getquestionweAreOn()==4){
                    testValid=false;
                    intent.putExtra("scoreValue",scoreValue);
                    startActivity(intent);
                }else{

                    loadNextQuestion();
                    setupQuestion();
                }
                break;
            case(R.id.answer2):
                if(answer2.getText()==quiz.myQuestions[quiz.getquestionweAreOn()].getAnswer() && testValid){
                    scoreValue+=5;
                    scoreUpdate();
                }
                if(quiz.getquestionweAreOn()==4){
                    testValid=false;
                    intent.putExtra("scoreValue",scoreValue);
                    startActivity(intent);
                }else{
                    loadNextQuestion();
                    setupQuestion();
                }
                break;
            case(R.id.answer3):
                if(answer3.getText()==quiz.myQuestions[quiz.getquestionweAreOn()].getAnswer() && testValid){
                    scoreValue+=5;
                    scoreUpdate();
                }
                if(quiz.getquestionweAreOn()==4){
                    testValid=false;
                    intent.putExtra("scoreValue",scoreValue);
                    startActivity(intent);
                }else{
                    loadNextQuestion();
                    setupQuestion();
                }
                break;
            case(R.id.answer4):
                if(answer4.getText()==quiz.myQuestions[quiz.getquestionweAreOn()].getAnswer() && testValid){
                    scoreValue+=5;
                    scoreUpdate();
                }
                if(quiz.getquestionweAreOn()==4){
                    testValid=false;
                    intent.putExtra("scoreValue",scoreValue);
                    startActivity(intent);
                }else{
                    loadNextQuestion();
                    setupQuestion();
                }
                break;
            default:
                Toast.makeText(this,"Hmm...Something went oopsie",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
public void scoreUpdate(){
    score.setText("Score: "+String.valueOf(scoreValue));
}
public void loadNextQuestion(){quiz.incrementquestionweAreOn();}
}
