package com.example.alejandro.calcoach;

import java.util.ArrayList;

/**
 * Created by Alejandro on 17/11/2017.
 */

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();
    private int numQuiz;
    private int questionActual=0;// -1 significa que el quiz no se ha empezado a responder
    private double numQuestions=0; //numero de preguntas del quiz

    public Quiz(int numQuiz) {
        this.numQuiz = numQuiz;
        chargeQuestions();

    }

    public void chargeQuestions(){

        String [][] data = Data.getQuiz();

        for(int i = 0; i< data.length; i++){
            questions.add(new Question(data[i][0],data[i][1], data[i][2], data[i][3], data[i][4] ));
            numQuestions++;
        }

    }

    public boolean hasNextQuestion(){
        if(questionActual <questions.size()){
            return true;
        }else
            return false;

    }

    public Question getActualQuestion(){

            return questions.get(questionActual);
    }

    public boolean aswerQuestionActual(String answer){

        if(questions.get(questionActual).answerQuestion(answer)){
            questionActual++;
            return true;
        } else {
            questionActual++;
            return false;
        }
    }

    public double getCalification(){
        int cont = 0;
        for (Question question: questions) {

            if(question.getCalification()==1){
                cont++;
            }
        }
        return (5/numQuestions)*cont;
    }
}
