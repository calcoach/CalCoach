package com.example.alejandro.calcoach;
import android.support.v7.app.AppCompatActivity;

import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Created by Alejandro on 18/11/2017.
 */

public class Data {

    public static boolean start=true;
    public static int actualQuiz = 1;

    public static String[][] getQuiz(){


        if(actualQuiz==1){
            return quiz1();
        }

        else{
            return null;
        }
    }

    private String[][] readQuiz(AppCompatActivity a) {

        String[][] quiz = new String[5][5];
        try
        {
          /*  InputStream fraw = a.
                    getResources().openRawResource(R);

            BufferedReader brin =
                    new BufferedReader(new InputStreamReader(fraw));

            String linea = brin.readLine();

            fraw.close();*/
        }
        catch (Exception ex)
        {
           // Log.e("Ficheros", "Error al leer fichero desde recurso raw");
        }
       return null;
    }

    private static String [][] quiz1(){
        String [][] quiz1 = new String[3][5];
        quiz1[0][0] = "1) El Lim x+2, cuando x->1 es:";
        quiz1[0][1] ="3";//L primera siempre es la respuesta correcta;
        quiz1[0][2] ="12";
        quiz1[0][3] ="2";
        quiz1[0][4] ="0";

        quiz1[1][0] = "2) El lim x^(2)+3x+2 cuando x->0 es: ";
        quiz1[1][1] ="2";//L primera siempre es la respuesta correcta;
        quiz1[1][2] ="5";
        quiz1[1][3] ="0";
        quiz1[1][4] ="7";

        quiz1[0][0] = "3) En que intervalo es continua la funcion f(x)=x+2:";
        quiz1[0][1] ="(2,∞)";//L primera siempre es la respuesta correcta;
        quiz1[0][2] ="(-∞,∞)";
        quiz1[0][3] ="Todos los R(reales)";
        quiz1[0][4] ="No es continua";
        return quiz1;
    }


    private static String [][] quiz2(){
        String [][] quiz2 = new String[3][5];
        quiz2[0][0] = "1) La derivada de (-2x2-5x+2) es:";
        quiz2[0][1] ="-4x-5 ";//L primera siempre es la respuesta correcta;
        quiz2[0][2] ="-2x-5";
        quiz2[0][3] ="-4x";
        quiz2[0][4] ="0";

        quiz2[1][0] = "2) La derivada de (3x3-2x2-5x+2) es:";
        quiz2[1][1] ="9x2-4x-5";//L primera siempre es la respuesta correcta;
        quiz2[1][2] ="9x2-4x";
        quiz2[1][3] ="-2x2-5x+2";
        quiz2[1][4] ="0";

        quiz2[0][0] = "3) La derivada de (x2-1)(x3+3x) es:";
        quiz2[0][1] ="2x(x3+3x)+(x2-1)(3x2+3) ";//L primera siempre es la respuesta correcta;
        quiz2[0][2] ="2x+(x2-1)(3x2+3)";
        quiz2[0][3] ="(x2-1)(3x2+3)";
        quiz2[0][4] ="(x3+3x)+(x2-1)";
        return quiz2;
    }
    private static String [][] quiz3(){
        String [][] quiz3 = new String[3][5];
        quiz3[0][0] = "1) La funcion f(x)=3-x^(3):";
        quiz3[0][1] ="Decrece(-∞,-1), crece(-1,1),decrece(1,∞)";//L primera siempre es la respuesta correcta;
        quiz3[0][2] ="Decrece(-∞,1), crece (1,∞)";
        quiz3[0][3] ="crece (1,∞)";
        quiz3[0][4] ="Decrece(-∞,1)";

        quiz3[1][0] = "2) La funcion f(x)=x^(2):";
        quiz3[1][1] ="crece(0,∞)";//L primera siempre es la respuesta correcta;
        quiz3[1][2] ="decrece(0,∞)";
        quiz3[1][3] ="crece(-∞,∞)";
        quiz3[1][4] ="decrece(-1,1)";

        quiz3[0][0] = "3) La funcion f(x)= 3x-x^(3):";
        quiz3[0][1] ="convexa (-∞,0), concava(0,∞)";//L primera siempre es la respuesta correcta;
        quiz3[0][2] =" concava(0,∞)";
        quiz3[0][3] ="convexa (-∞,0)";
        quiz3[0][4] ="es recta";
        return quiz3;
    }

}

