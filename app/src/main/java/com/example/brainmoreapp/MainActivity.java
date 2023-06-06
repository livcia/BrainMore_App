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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        language = findViewById(R.id.Lng);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.apply();
        Boolean Ln = pref.getBoolean("BLang", false);

        language.setChecked(Ln);

        OpenFlashCards = findViewById(R.id.flashcards);
        OpenQuiz = findViewById(R.id.quiz);
        OpenWordGame = findViewById(R.id.wordgame);

        language.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(language.isChecked()){
                    OpenFlashCards.setText("Flashcards");
                    OpenWordGame.setText("WordGame");
                }else{
                    OpenFlashCards.setText("Fiszki");
                    OpenWordGame.setText("Gra słów");
                }
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
}