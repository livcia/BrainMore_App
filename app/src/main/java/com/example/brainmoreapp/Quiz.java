package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Quiz extends AppCompatActivity {
    TextView TextViewquestion;
    Button btn1, btn2, btn3, btn4, next;
    Random rand;
    int indexofquestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] questions = new String[] {
                "abcd",
                "efgh",
                "ijkl",
                "mnop",
                "rstu",
                "wxyz"
        };
        String[] answers = new String[]{
          "a", "b", "c", "d",
          "e", "f", "g", "h",
          "i", "j", "k", "l",
          "m", "n", "o", "p",
          "r", "s", "t", "u",
          "w", "x", "y", "z"
        };
        Map<String, String> map = new HashMap<String, String>();
        map.put("abcd", "d");
        map.put("efgh", "h");
        map.put("ijkl", "l");
        map.put("mnop", "p");
        map.put("rstu", "u");
        map.put("wxyz", "z");
        List<String> Listquestions = new ArrayList<>(Arrays.asList(questions));
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
        next = (Button) findViewById(R.id.next_question);
        rand = new Random();
        indexofquestion = rand.nextInt(Listquestions.size());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Intent intent = getIntent();
        Boolean lang = intent.getBooleanExtra("PL_or_ENG",false);
        TextViewquestion = findViewById(R.id.ask);
        String test = map.get(Listquestions.get(indexofquestion));
        TextViewquestion.setText(test);
    }
    public void clickEvent(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}