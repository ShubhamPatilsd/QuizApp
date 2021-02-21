package com.example.quizapp;

public class Quiz {
    private int questionWeAreOn;
    public Question[] myQuestions={
            new Question("What is 1+1",new String[]{"2","3","4","5"},"2" ),
            new Question("What is 25*5",new String[] {"5","250","125","520"},"125" ),
            new Question("What country is Moscow in",new String[] {"Uzbekistan","Russia","Germany","France"},"Russia" ),
            new Question("Company that develops Minecraft",new String[] {"Microsoft","EA Sports","Mojang","Ubisoft"},"Mojang" ),
            new Question("What time of year is apple cider drunk",new String[] {"Thanksgiving","Easter","Halloween","Christmas"},"Christmas" ),
    };

    public int getquestionweAreOn(){
        return questionWeAreOn;
    }
    public void setquestionweAreOn(int questionWeAreOn){
        this.questionWeAreOn=questionWeAreOn;
    }

    public void incrementquestionweAreOn(){
        questionWeAreOn++;
    }

}
