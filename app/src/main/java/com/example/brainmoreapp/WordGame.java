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
    Button letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, letterJ, letterK, letterL, letterM, letterN, letterO, letterP, letterR, letterS, letterT, letterU, letterW, letterX, letterY, letterZ;
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
        letterA = findViewById(R.id.letterA);
        letterB = findViewById(R.id.letterB);
        letterC = findViewById(R.id.letterC);
        letterD = findViewById(R.id.letterD);
        letterE = findViewById(R.id.letterE);
        letterF = findViewById(R.id.letterF);
        letterG = findViewById(R.id.letterG);
        letterH = findViewById(R.id.letterH);
        letterI = findViewById(R.id.letterI);
        letterJ = findViewById(R.id.letterJ);
        letterK = findViewById(R.id.letterK);
        letterL = findViewById(R.id.letterL);
        letterM = findViewById(R.id.letterM);
        letterN = findViewById(R.id.letterN);
        letterO = findViewById(R.id.letterO);
        letterP = findViewById(R.id.letterP);
        letterR = findViewById(R.id.letterR);
        letterS = findViewById(R.id.letterS);
        letterT = findViewById(R.id.letterT);
        letterU = findViewById(R.id.letterU);
        letterW = findViewById(R.id.letterW);
        letterX = findViewById(R.id.letterX);
        letterY = findViewById(R.id.letterY);
        letterZ = findViewById(R.id.letterZ);
        letterA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterA, false);
            }
        });
        letterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterB, false);
            }
        });
        letterC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterC, false);
            }
        });
        letterD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterD, false);
            }
        });
        letterE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterE, false);
            }
        });
        letterF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterF, false);
            }
        });

        letterG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterG, false);
            }
        });

        letterH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterH, false);
            }
        });

        letterI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterI, false);
            }
        });

        letterJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterJ, false);
            }
        });

        letterK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterK, false);
            }
        });

        letterL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterL, false);
            }
        });

        letterM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterM, false);
            }
        });

        letterN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterN, false);
            }
        });

        letterO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterO, false);
            }
        });

        letterP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterP, false);
            }
        });

        letterR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterR, false);
            }
        });

        letterS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterS, false);
            }
        });

        letterT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterT, false);
            }
        });

        letterU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterU, false);
            }
        });

        letterW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterW, false);
            }
        });

        letterX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterX, false);
            }
        });

        letterY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterY, false);
            }
        });

        letterZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterZ, false);
            }
        });

    }
    public void blockButton(Button btn, boolean blockorleave){
        btn.setEnabled(blockorleave);
    }
    public void clickEvent(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    }