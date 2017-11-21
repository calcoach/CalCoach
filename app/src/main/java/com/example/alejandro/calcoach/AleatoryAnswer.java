package com.example.alejandro.calcoach;

import java.util.Random;

/**
 * Created by Alejandro on 20/11/2017.
 */

public class AleatoryAnswer {

    Question question ;
    String [] answer = new String [4];
    int n=0;

    public AleatoryAnswer(Question q){
        this.question = q;
        blendQuestions();
    }

    private void blendQuestions(){
        String answer = question.getAnswer();
        String answer1 = question.getAnswerOne();
        String answer2 = question.getAnswerTwo();
        String answer3 = question.getAnswerTree();

        this.answer[0] = answer;
        this.answer[1] = answer1;
        this.answer[2] = answer2;
        this.answer[3] = answer3;

        Random aleatorio = new Random(System.currentTimeMillis());
        // Producir nuevo int aleatorio entre 0 y 99
        int intAleatorio = aleatorio.nextInt(4);
        String copy = this.answer[intAleatorio];
        this.answer[intAleatorio] = this.answer[0];
        this.answer[0]= copy;

    }

    public String getAnswer(){
       String a = this.answer[n];
       n++;
       return a;
    }
}
