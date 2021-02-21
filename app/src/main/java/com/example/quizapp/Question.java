package com.example.quizapp;
//array of strings containing questions called myQuestions
//array of arrays of strings containing choices called myChoices
public class Question{
    private String name;
    private String[] choices=new String[4];
    private String answer;

    public Question(String name,String[] choices ,String answer){
        this.name=name;
        this.choices=choices;
        this.answer=answer;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
       return name;
    }
    public void setChoices(String[] choices){
        this.choices=choices;
    }
    public String[] getChoices(){
        return choices;
    }
    public void setAnswer(String answer){
        this.answer=answer;
    }
    public String getAnswer(){
        return answer;
    }
}
