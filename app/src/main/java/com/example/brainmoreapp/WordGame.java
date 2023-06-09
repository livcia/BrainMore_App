package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class WordGame extends AppCompatActivity {
    String[] PLWords = new String[] {"PLANETA", "DELFIN", "FIGURA"};
    String[] ENGWords = new String[] {"FAIRLY", "TRUSTY", "MISFIT"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_game);
        Intent intent = getIntent();
        Boolean lang = intent.getBooleanExtra("PL_or_ENG",false);;
    }
    public void clickEvent(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}