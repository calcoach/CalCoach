package com.example.alejandro.calcoach;

/**
 * Created by Alejandro on 18/11/2017.
 */

public class Data {

    public static String[][] getQuiz(){

        String [][] quiz1 = new String[2][5];
        quiz1[0][0] = "La deriada de 7X es:";
        quiz1[0][1] ="7";//L primera siempre es la respuesta correcta;
        quiz1[0][2] ="8X";
        quiz1[0][3] ="7X";
        quiz1[0][4] ="2X";

        quiz1[1][0] = "La deriada de 20X es:";
        quiz1[1][1] ="20";//L primera siempre es la respuesta correcta;
        quiz1[1][2] ="8X";
        quiz1[1][3] ="7X";
        quiz1[1][4] ="2X";
        return  quiz1;
    }
}
