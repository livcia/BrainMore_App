package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button OpenFlashCards = findViewById(R.id.flashcards);
        Switch language = findViewById(R.id.Lng);
        Button OpenWordGame = findViewById(R.id.wordgame);
        language.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(language.isChecked()){
                    OpenFlashCards.setText("Flashcards");
                    OpenWordGame.setText("WordGame");
                }else{
                    OpenFlashCards.setText("Fiszki");
                    OpenWordGame.setText("Gra słów");
                }
            }
        });

        OpenFlashCards.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Flashcards.class);
                startActivity(intent);
            }
        });
        Button OpenQuiz = findViewById(R.id.quiz);
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