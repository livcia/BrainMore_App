package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WordGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_game);
        TextView x = findViewById(R.id.test);
        Intent intent = getIntent();
        Boolean lang = intent.getBooleanExtra("PL_or_ENG",false);
        if (lang){
            x.setText("ENG");
        }else{
            x.setText("PL");
        }
    }
    public void clickEvent(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}