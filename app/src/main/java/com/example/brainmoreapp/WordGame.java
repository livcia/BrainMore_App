package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class WordGame extends AppCompatActivity {
    String[] PLWords = new String[] {"PLANETA", "DELFIN", "FIGURA"};
    String[] ENGWords = new String[] {"FAIRLY", "TRUSTY", "MISFIT"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_game);
        Intent intent = getIntent();
        Boolean lang = intent.getBooleanExtra("PL_or_ENG",false);
        Random rand = new Random();
        int IntwordPL = rand.nextInt(PLWords.length);
        TextView text = findViewById(R.id.textViewGenerate);
        Button drawWord = findViewById(R.id.drawWord);
        if(lang){
            drawWord.setText("Draw word");
        }else{
            drawWord.setText("Losuj slowo");
        }

    }
    public void clickEvent(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}