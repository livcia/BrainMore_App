package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Numbers_game extends AppCompatActivity {
Boolean lang;
Button Brandom, reset, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
TextView write_number;
Integer randomnumber;
Button btns[];
ArrayList<Integer> numbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_game);
        Brandom = findViewById(R.id.random);
        reset = findViewById(R.id.reset);
        write_number = findViewById(R.id.write_number);
        numbers = new ArrayList<Integer>();
        Intent intent = getIntent();
        lang = intent.getBooleanExtra("PL_or_ENG", false);
        if(lang){
            reset.setText("RESTART GAME :)");
            Brandom.setText("RANDOM NUMBER");
        }else{
            reset.setText("OD NOWA");
            Brandom.setText("LOSUJ CYFRE");
        }
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
        btns = new Button[]{b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15};
        blockOrUnlock_all_buttons(false);

        Brandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                randomnumber = rand.nextInt(1000);
                write_number.setText(""+randomnumber);
                Brandom.setEnabled(false);
                blockOrUnlock_all_buttons(true);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(Button btn: btns){
                    btn.setText("");
                    btn.setEnabled(false);
                }
                Brandom.setEnabled(true);
                write_number.setText("");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b9);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b10);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b11);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b12);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b13);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b14);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afterclick(b15);
            }
        });
    }
    public void clickEvent(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void afterclick(Button whichbutotn){
        if(whichbutotn.getText() == "") {
            Brandom.setEnabled(true);
            whichbutotn.setTextSize(23);
            whichbutotn.setText("" + randomnumber);
            write_number.setText("");
            blockOrUnlock_all_buttons(false);
            Toastifsequence();
        }
    }
    public void blockOrUnlock_all_buttons(Boolean BlockOrUnlock){
        for(int i = 0; i<btns.length ;i++){
            btns[i].setEnabled(BlockOrUnlock);
        }
    }
    public Boolean ifsequence(){
        for(int i = 0; i<btns.length ;i++){
            if(btns[i].getText() != ""){
                numbers.add(Integer.parseInt(btns[i].getText().toString()));
            }
        }
        ArrayList<Integer> sortedArrayList = new ArrayList<>(numbers);
        Collections.sort(sortedArrayList);
        return numbers.equals(sortedArrayList);
    }
    public void Toastifsequence(){
        numbers.clear();
        if(!ifsequence()){
            Toast.makeText(getApplicationContext(),"LOSE! :(",Toast.LENGTH_SHORT).show();
            Brandom.setEnabled(false);
        }
    }
}