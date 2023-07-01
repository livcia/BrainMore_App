package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class Quizz extends AppCompatActivity {
    String[] questions, answers;
    Map<String, String> map;
    Button btn1, btn2, btn3, btn4;
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
        map = new HashMap<String, String>();
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
        btn1.setText("dd");
    }
}