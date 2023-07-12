package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Quizz extends AppCompatActivity {
    String[] questions, answers;
    Button [] btns;
    Map<String, String> map;
    Button btn1, btn2, btn3, btn4, next_question;
    Random rand;
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
        answers = new String[]{
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
        map.put("abcd", "d");
        map.put("efgh", "h");
        map.put("ijkl", "l");
        map.put("mnop", "p");
        map.put("rstu", "u");
        map.put("wxyz", "z");
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
        next_question = findViewById(R.id.next_question);
        btns = new Button[]{btn1, btn2, btn3, btn4};
        btn1.setText("dd");
        rand = new Random();
        next_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                indexofquestion = rand.nextInt(Listquestions.size());
            }
        });
    }
}