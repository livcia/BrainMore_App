package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.nio.charset.Charset;
import java.util.Random;

public class WordGame extends AppCompatActivity {
    Random rand;
    String[] PLWords = new String[]{"CHEMIA","DELFIN", "FIGURA", "LOSOWE", "ABSURD","AFRYKA","BABCIA","AMELIA","ANONIM","ARBUZY","ARABKI","ARKUSZ","ARONIA","AROMAT"};
    String[] ENGWords = new String[]{"TRUSTY", "MISFIT"};
    TextView[] Letters;
    Button drawWord, letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, letterJ, letterK, letterL, letterM, letterN, letterO, letterP, letterR, letterS, letterT, letterU, letterW, letterX, letterY, letterZ;
    int IntwordPL, index;
    Boolean lang;
    TextView l1, l2, l3, l4, l5, l6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_game);
        Intent intent = getIntent();
        lang = intent.getBooleanExtra("PL_or_ENG", false);
        rand = new Random();
        IntwordPL = rand.nextInt(PLWords.length);
        drawWord = findViewById(R.id.drawWord);
        if (lang) {
            drawWord.setText("Draw word");
            IntwordPL = rand.nextInt(ENGWords.length);
        } else {
            drawWord.setText("Losuj slowo");
            IntwordPL = rand.nextInt(PLWords.length);
        }
        l1 = findViewById(R.id.letter1);
        l2 = findViewById(R.id.letter2);
        l3 = findViewById(R.id.letter3);
        l4 = findViewById(R.id.letter4);
        l5 = findViewById(R.id.letter5);
        l6 = findViewById(R.id.letter6);
        Letters = new TextView[]{l1, l2, l3, l4, l5, l6};
        drawWord = findViewById(R.id.drawWord);
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
                if(lang){
                    if(ifLetterENG("A")){
                        checkindexofletter("A", lang);
                    }
                }else{
                    if(ifLetterPL("A")){
                        checkindexofletter("A", lang);
                    }
                }
            }
        });
        letterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterB, false);
                if(lang){
                    if(ifLetterENG("B")){
                        checkindexofletter("B", lang);
                    }
                }else{
                    if(ifLetterPL("B")){
                        checkindexofletter("B", lang);
                    }
                }
            }
        });
        letterC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterC, false);
                if(lang){
                    if(ifLetterENG("C")){
                        checkindexofletter("C", lang);
                    }
                }else{
                    if(ifLetterPL("C")){
                        checkindexofletter("C", lang);
                    }
                }
            }
        });
        letterD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterD, false);
                if(lang){
                    if(ifLetterENG("D")){
                        checkindexofletter("D", lang);
                    }
                }else{
                    if(ifLetterPL("D")){
                        checkindexofletter("D", lang);
                    }
                }
            }
        });
        letterE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterE, false);
                if(lang){
                    if(ifLetterENG("E")){
                        checkindexofletter("E", lang);
                    }
                }else{
                    if(ifLetterPL("E")){
                        checkindexofletter("E", lang);
                    }
                }
            }
        });
        letterF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterF, false);
                if(lang){
                    if(ifLetterENG("F")){
                        checkindexofletter("F", lang);
                    }
                }else{
                    if(ifLetterPL("F")){
                        checkindexofletter("F", lang);
                    }
                }
            }
        });

        letterG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterG, false);
                if(lang){
                    if(ifLetterENG("G")){
                        checkindexofletter("G", lang);
                    }
                }else{
                    if(ifLetterPL("G")){
                        checkindexofletter("G", lang);
                    }
                }
            }
        });

        letterH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterH, false);
                if(lang){
                    if(ifLetterENG("H")){
                        checkindexofletter("H", lang);
                    }
                }else{
                    if(ifLetterPL("H")){
                        checkindexofletter("H", lang);
                    }
                }
            }
        });

        letterI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterI, false);
                if(lang){
                    if(ifLetterENG("I")){
                        checkindexofletter("I", lang);
                    }
                }else{
                    if(ifLetterPL("I")){
                        checkindexofletter("I", lang);
                    }
                }
            }
        });

        letterJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterJ, false);
                if(lang){
                    if(ifLetterENG("J")){
                        checkindexofletter("J", lang);
                    }
                }else{
                    if(ifLetterPL("J")){
                        checkindexofletter("J", lang);
                    }
                }
            }
        });

        letterK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterK, false);
                if(lang){
                    if(ifLetterENG("K")){
                        checkindexofletter("K", lang);
                    }
                }else{
                    if(ifLetterPL("K")){
                        checkindexofletter("K", lang);
                    }
                }
            }
        });

        letterL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterL, false);
                if(lang){
                    if(ifLetterENG("L")){
                        checkindexofletter("L", lang);
                    }
                }else{
                    if(ifLetterPL("L")){
                        checkindexofletter("L", lang);
                    }
                }
            }
        });

        letterM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterM, false);
                if(lang){
                    if(ifLetterENG("M")){
                        checkindexofletter("M", lang);
                    }
                }else{
                    if(ifLetterPL("M")){
                        checkindexofletter("M", lang);
                    }
                }
            }
        });

        letterN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterN, false);
                if(lang){
                    if(ifLetterENG("N")){
                        checkindexofletter("N", lang);
                    }
                }else{
                    if(ifLetterPL("N")){
                        checkindexofletter("N", lang);
                    }
                }
            }
        });

        letterO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterO, false);
                if(lang){
                    if(ifLetterENG("O")){
                        checkindexofletter("O", lang);
                    }
                }else{
                    if(ifLetterPL("O")){
                        checkindexofletter("O", lang);
                    }
                }
            }
        });

        letterP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterP, false);
                if(lang){
                    if(ifLetterENG("P")){
                        checkindexofletter("P", lang);
                    }
                }else{
                    if(ifLetterPL("P")){
                        checkindexofletter("P", lang);
                    }
                }
            }
        });

        letterR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterR, false);
                if(lang){
                    if(ifLetterENG("R")){
                        checkindexofletter("R", lang);
                    }
                }else{
                    if(ifLetterPL("R")){
                        checkindexofletter("R", lang);
                    }
                }
            }
        });

        letterS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterS, false);
                if(lang){
                    if(ifLetterENG("S")){
                        checkindexofletter("S", lang);
                    }
                }else{
                    if(ifLetterPL("S")){
                        checkindexofletter("S", lang);
                    }
                }
            }
        });

        letterT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterT, false);
                if(lang){
                    if(ifLetterENG("T")){
                        checkindexofletter("T", lang);
                    }
                }else{
                    if(ifLetterPL("T")){
                        checkindexofletter("T", lang);
                    }
                }
            }
        });

        letterU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterU, false);
                if(lang){
                    if(ifLetterENG("U")){
                        checkindexofletter("U", lang);
                    }
                }else{
                    if(ifLetterPL("U")){
                        checkindexofletter("U", lang);
                    }
                }
            }
        });

        letterW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterW, false);
                if(lang){
                    if(ifLetterENG("W")){
                        checkindexofletter("W", lang);
                    }
                }else{
                    if(ifLetterPL("W")){
                        checkindexofletter("W", lang);
                    }
                }
            }
        });

        letterX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterX, false);
                if(lang){
                    if(ifLetterENG("X")){
                        checkindexofletter("X", lang);
                    }
                }else{
                    if(ifLetterPL("X")){
                        checkindexofletter("X", lang);
                    }
                }
            }
        });

        letterY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterY, false);
                if(lang){
                    if(ifLetterENG("Y")){
                        checkindexofletter("Y", lang);
                    }
                }else{
                    if(ifLetterPL("Y")){
                        checkindexofletter("Y", lang);
                    }
                }
            }
        });

        letterZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterZ, false);
                if(lang){
                    if(ifLetterENG("Z")){
                        checkindexofletter("Z", lang);
                    }
                }else{
                    if(ifLetterPL("Z")){
                        checkindexofletter("Z", lang);
                    }
                }
            }
        });
        drawWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rand = new Random();
                IntwordPL = rand.nextInt(PLWords.length);
                blockButton(letterA, true);
                blockButton(letterB, true);
                blockButton(letterC, true);
                blockButton(letterD, true);
                blockButton(letterE, true);
                blockButton(letterF, true);
                blockButton(letterG, true);
                blockButton(letterH, true);
                blockButton(letterI, true);
                blockButton(letterJ, true);
                blockButton(letterK, true);
                blockButton(letterL, true);
                blockButton(letterM, true);
                blockButton(letterN, true);
                blockButton(letterO, true);
                blockButton(letterP, true);
                blockButton(letterR, true);
                blockButton(letterS, true);
                blockButton(letterT, true);
                blockButton(letterU, true);
                blockButton(letterW, true);
                blockButton(letterX, true);
                blockButton(letterY, true);
                blockButton(letterZ, true);
                Integer index = 0;
                while(index < Letters.length){
                    Letters[index].setText("_");
                    index += 1;
                }
            }
        });
    }

    public void blockButton(Button btn, boolean blockorleave) {
        btn.setEnabled(blockorleave);
    }

    public Boolean ifLetterENG(CharSequence letter) {
            String ltr = ENGWords[IntwordPL];
            if (ltr.contains(letter)) {
                return true;
            } else {
                return false;
            }
        }
    public Boolean ifLetterPL(CharSequence letter) {
        String ltr = PLWords[IntwordPL];
        if (ltr.contains(letter)) {
            return true;
        } else {
            return false;
        }
    }
    public void showletter(Integer index, String letter){
        Letters[index].setText(letter);
    }
    public void checkindexofletter(String letter, Boolean lang) {
        if (!lang) {
            index = PLWords[IntwordPL].indexOf(letter);
            while (index >= 0) {
                showletter(index, letter);
                index = PLWords[IntwordPL].indexOf(letter, index + 1);
            }
        } else {
            index = ENGWords[IntwordPL].indexOf(letter);
            while (index >= 0) {
                showletter(index, letter);
                index = ENGWords[IntwordPL].indexOf(letter, index + 1);
            }
        }
    }
    public void clickEvent(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}