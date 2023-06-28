package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Numbers_game extends AppCompatActivity {
Boolean lang;
Button Brandom;
TextView write_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_game);
        Intent intent = getIntent();
        lang = intent.getBooleanExtra("PL_or_ENG", false);
        Brandom = findViewById(R.id.random);
        write_number = findViewById(R.id.write_number);
        Brandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                Integer s = rand.nextInt(1000);
                write_number.setText(""+s);
            }
        });
    }
    public void clickEvent(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}