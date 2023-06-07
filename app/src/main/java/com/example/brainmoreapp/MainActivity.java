package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button OpenFlashCards, OpenWordGame, OpenQuiz;
    Switch language;
    String TextFlashcards, TextWordPlay;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        language = findViewById(R.id.Lng);
        OpenFlashCards = findViewById(R.id.flashcards);
        OpenQuiz = findViewById(R.id.quiz);
        OpenWordGame = findViewById(R.id.wordgame);
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        editor = pref.edit();
        editor.apply();
        Boolean Ln = pref.getBoolean("BLang", false);
        language.setChecked(Ln);
        getLanguage(Ln);

        language.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                getLanguage(language.isChecked());
                editor.putBoolean("BLang", language.isChecked()).commit();
            }
        });
        OpenFlashCards.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Flashcards.class);
                startActivity(intent);
            }
        });
        OpenQuiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Quiz.class);
                startActivity(intent);
            }
        });
        OpenWordGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WordGame.class);
                startActivity(intent);
            }
        });
    }
    private void getLanguage(Boolean lang){
        if (lang){
            TextFlashcards = "Flashcards";
            TextWordPlay = "WordGame";
        }else{
            TextFlashcards = "Fiszki";
            TextWordPlay = "Gra słów";
        }
        OpenFlashCards.setText(TextFlashcards);
        OpenWordGame.setText(TextWordPlay);
    }

}