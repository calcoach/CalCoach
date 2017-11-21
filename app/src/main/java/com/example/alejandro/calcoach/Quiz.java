package com.example.alejandro.calcoach;

import java.util.ArrayList;

/**
 * Created by Alejandro on 17/11/2017.
 */

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();
    private int numQuiz;
    private int questionActual=-1;// -1 significa que el quiz no se ha empezado a responder
    private int numQuestions=0; //numero de preguntas del quiz

    public Quiz(int numQuiz) {
        this.numQuiz = numQuiz;
        chargeQuestions();

    }

    public void chargeQuestions(){

        String [][] data = Data.getQuiz();

        questions.add(new Question(data[0][0],data[0][1], data[0][2], data[0][3], data[0][4] ));
        questions.add(new Question(data[1][0],data[1][1], data[1][2], data[1][3], data[1][4] ));
    }

    public boolean hasNextQuestion(){
        if(questionActual <questions.size()-1){
            return true;
        }else
            return false;

    }

    public Question getActualQuestion(){
        return questions.get(questionActual);
    }

    public void aswerQuestionActual(String answer){

        questionActual++;

        questions.get(questionActual).answerQuestion(answer);

    }

    public int getCalification(){
        int cont = 0;
        for (Question question: questions) {

            if(question.getCalification()==1){
                cont++;
            }
        }
        return (5/questions.size())*cont;
    }
}
