package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Quizz extends AppCompatActivity {
    String[] questions, allanswers;
    Button [] btns;
    Map<String, String> map;
    Button btn1, btn2, btn3, btn4, next_question;
    Random rand;
    List<String> answers;
    TextView question;
    int indexofquestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        questions = new String[] {
                "abcd",
                "efgh",
                "ijkl",
                "mnop",
                "rstu",
                "wxyz"
        };
        allanswers = new String[]{
                "a", "b", "c", "d",
                "e", "f", "g", "h",
                "i", "j", "k", "l",
                "m", "n", "o", "p",
                "r", "s", "t", "u",
                "w", "x", "y", "z"
        };
        Intent intent = getIntent();
        Boolean lang = intent.getBooleanExtra("PL_or_ENG",false);
        map = new HashMap<String, String>();
        List<String> Listquestions = new ArrayList<>(Arrays.asList(questions));
        List<String> ListAllAnswers = new ArrayList<>(Arrays.asList(allanswers));
        map.put("abcd", "d");
        map.put("efgh", "h");
        map.put("ijkl", "l");
        map.put("mnop", "p");
        map.put("rstu", "u");
        map.put("wxyz", "z");
        question = findViewById(R.id.ask);
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
        next_question = findViewById(R.id.next_question);
        btns = new Button[]{btn1, btn2, btn3, btn4};
        btn1.setText("dd");
        answers = new ArrayList<String>();
        rand = new Random();
        next_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                indexofquestion = rand.nextInt(Listquestions.size());
                question.setText(Listquestions.get(indexofquestion));
                answers.add(ListAllAnswers.get(indexofquestion*4));
                answers.add(ListAllAnswers.get(indexofquestion*4+1));
                answers.add(ListAllAnswers.get(indexofquestion*4+2));
                answers.add(ListAllAnswers.get(indexofquestion*4+3));
                Collections.shuffle(answers);
                for(int i = 0; i<4 ;i++){
                    btns[i].setText(answers.get(i));
                }
                answers.clear();
            }
        });
    }
}