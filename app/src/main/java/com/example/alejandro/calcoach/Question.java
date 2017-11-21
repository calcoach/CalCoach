package com.example.alejandro.calcoach;

/**
 * Created by Alejandro on 17/11/2017.
 */

public class Question {

    private String Question;

    public Question(String question, String answer, String answerOne, String answerTwo, String answerTree) {
        this.answerTwo = answerTwo;
        this.answer = answer;
        this.answerOne = answerOne;
        this.answerTree = answerTree;
        this.Question = question;

    }

    private String answer;
    private String answerOne;
    private String answerTwo;
    private String answerTree;
    private int state = -1; //1 correcto, 0 incorrecto, -1 no ha respondido

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public String getAnswerTree() {
        return answerTree;
    }

    public void setAnswerOne(String answerOne) {
        this.answerOne = answerOne;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean answerQuestion(String rta){

        if(rta.equals(answer)){
            state = 1;
            return true;
        }
        else{
            state = 0;
            return false;
        }
    }

    public int getCalification() {
        return state;
    }
}
