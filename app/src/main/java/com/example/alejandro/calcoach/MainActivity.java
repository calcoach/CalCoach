package com.example.alejandro.calcoach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;
    Button button;
    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.editText).setFocusable(false);
        final Quiz quiz1 = new Quiz(1);
        radioGroup = findViewById(R.id.rGroup);
        r1 = findViewById(R.id.radioButton);
        r2 = findViewById(R.id.radioButton2);
        r3 = findViewById(R.id.radioButton3);
        r4 = findViewById(R.id.radioButton4);
        button = findViewById(R.id.button);
        question = findViewById(R.id.editText);

        nextQuestion(quiz1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r1.isChecked()){

                    answerQuestion((String) r1.getText(),quiz1);
                }else{
                    if(r2.isChecked()){
                        answerQuestion((String) r1.getText(),quiz1);
                    }else{
                        if(r3.isChecked()){
                            answerQuestion((String) r1.getText(),quiz1);
                        }else{
                            if(r4.isChecked()){
                                answerQuestion((String) r1.getText(),quiz1);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Elija una respuesta",Toast.LENGTH_SHORT).show();

                            }
                        }
                    }
                }
                if(quiz1.hasNextQuestion()){
                    nextQuestion(quiz1);
                }else{
                    setContentView(R.layout.resultslayout);
                    Toast.makeText(getApplicationContext(), String.valueOf(quiz1.getCalification()),Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void nextQuestion(Quiz q){

        question.setText((CharSequence) q.getActualQuestion().getQuestion());
        AleatoryAnswer aleatoryAnswer = new AleatoryAnswer(q.getActualQuestion());
        r1.setText((CharSequence) aleatoryAnswer.getAnswer());
        r2.setText((CharSequence) aleatoryAnswer.getAnswer());
        r3.setText((CharSequence) aleatoryAnswer.getAnswer());
        r4.setText((CharSequence) aleatoryAnswer.getAnswer());
    }

    private void answerQuestion(String ans, Quiz quiz){
        if(quiz.aswerQuestionActual(ans)){
            Toast.makeText(getApplicationContext(), "Correcto",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Incorrecto",Toast.LENGTH_SHORT).show();
        }

        nextQuestion(quiz);
    }
}
