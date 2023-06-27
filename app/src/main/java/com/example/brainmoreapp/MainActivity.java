package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button OpenFlashCards, OpenWordGame, OpenQuiz;
    Switch language;
    String TextFlashcards, TextWordPlay;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);/*
                 _                                  _            __
                (_)                                | |          / _|
   __ _ ___ ___ _  __ _ _ __  _ __ ___   ___ _ __ | |_    ___ | |_  __   ____ _ _ __
  / _` / __/ __| |/ _` | '_ \| '_ ` _ \ / _ \ '_ \| __|  / _ \|  _| \ \ / / _` | '__|
 | (_| \__ \__ \ | (_| | | | | | | | | |  __/ | | | |_  | (_) | |    \ V / (_| | |
  \__,_|___/___/_|\__, |_| |_|_| |_| |_|\___|_| |_|\__|  \___/|_|     \_/ \__,_|_|
                   __/ |
                   |___/*/
        //arr.remove(1);

        language = findViewById(R.id.Lng);
        OpenFlashCards = findViewById(R.id.flashcards);
        OpenQuiz = findViewById(R.id.quiz);
        OpenWordGame = findViewById(R.id.wordgame);/*
  ______ _                           _ ______               ___
 / _____) |                         | (_____ \             / __)
( (____ | |__  _____  ____ _____  __| |_____) )___ _____ _| |__ _____  ____ _____ ____   ____ _____  ___
 \____ \|  _ \(____ |/ ___) ___ |/ _  |  ____/ ___) ___ (_   __) ___ |/ ___) ___ |  _ \ / ___) ___ |/___)
 _____) ) | | / ___ | |   | ____( (_| | |   | |   | ____| | |  | ____| |   | ____| | | ( (___| ____|___ |
(______/|_| |_\_____|_|   |_____)\____|_|   |_|   |_____) |_|  |_____)_|   |_____)_| |_|\____)_____|___/

*/
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
                intent.putExtra("PL_or_ENG", language.isChecked());
                startActivity(intent);
            }
        });
        OpenQuiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Quiz.class);
                intent.putExtra("PL_or_ENG", language.isChecked());
                startActivity(intent);
            }
        });
        OpenWordGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WordGame.class);
                intent.putExtra("PL_or_ENG", language.isChecked());
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