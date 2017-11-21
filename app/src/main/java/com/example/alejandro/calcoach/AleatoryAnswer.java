package com.example.alejandro.calcoach;

/**
 * Created by Alejandro on 20/11/2017.
 */

public class AleatoryAnswer {

    Question question ;
    String [] answer = new String [4];
    int n=0;

    public AleatoryAnswer(Question q){
        this.question = q;
    }

    private void blendQuestions(){
        String answer = question.getAnswer();
        String answer1 = question.getAnswerOne();
        String answer2 = question.getAnswerTwo();
        String answer3 = question.getAnswerTree();

        String h;

    }
}
