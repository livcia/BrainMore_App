package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Numbers_game extends AppCompatActivity {
Boolean lang;
Button Brandom, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
TextView write_number;
Integer randomnumber;
ArrayList<Integer> numbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_game);
        Intent intent = getIntent();
        lang = intent.getBooleanExtra("PL_or_ENG", false);
        Brandom = findViewById(R.id.random);
        write_number = findViewById(R.id.write_number);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);
        b15 = findViewById(R.id.b15);
        numbers = new ArrayList<Integer>();
        Brandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                randomnumber = rand.nextInt(1000);
                write_number.setText(""+randomnumber);
                Brandom.setEnabled(false);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b1.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b2.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b3.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b4.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                write_number.setText("");
                b5.setText(""+randomnumber);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b6.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b7.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b8.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b9.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b10.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b11.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b12.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b13.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b14.setText(""+randomnumber);
                write_number.setText("");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Brandom.setEnabled(true);
                b15.setText(""+randomnumber);
                write_number.setText("");
            }
        });
    }
    public void clickEvent(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}