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
    String[] PLWords = new String[]{"DELFIN", "FIGURA"};
    String[] ENGWords = new String[]{"FAIRLY", "TRUSTY", "MISFIT"};
    TextView[] Letters;
    Button drawWord, letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, letterJ, letterK, letterL, letterM, letterN, letterO, letterP, letterR, letterS, letterT, letterU, letterW, letterX, letterY, letterZ;
    int IntwordPL, index;
    TextView l1, l2, l3, l4, l5, l6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_game);
        Intent intent = getIntent();
        Boolean lang = intent.getBooleanExtra("PL_or_ENG", false);
        rand = new Random();
        IntwordPL = rand.nextInt(PLWords.length);
        drawWord = findViewById(R.id.drawWord);
        if (lang) {
            drawWord.setText("Draw word");
        } else {
            drawWord.setText("Losuj slowo");
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
                if (ifLetter("A",lang)){
                    checkindexofletter("A", lang);
                }
            }
        });
        letterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterB, false);
                if (ifLetter("B",lang)){
                    checkindexofletter("B", lang);
                }
            }
        });
        letterC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterC, false);
                if (ifLetter("C",lang)){
                    checkindexofletter("C", lang);
                }
            }
        });
        letterD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterD, false);
                if (ifLetter("D",lang)){
                    checkindexofletter("D", lang);
                }
            }
        });
        letterE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterE, false);
                if (ifLetter("E",lang)){
                    checkindexofletter("E", lang);
                }
            }
        });
        letterF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterF, false);
                if (ifLetter("F",lang)){
                    checkindexofletter("F", lang);
                }
            }
        });

        letterG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterG, false);
                if (ifLetter("G",lang)){
                    checkindexofletter("G", lang);
                }
            }
        });

        letterH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterH, false);
                if (ifLetter("H",lang)){
                    checkindexofletter("H", lang);
                }
            }
        });

        letterI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterI, false);
                if (ifLetter("I",lang)){
                    checkindexofletter("I", lang);
                }
            }
        });

        letterJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterJ, false);
                if (ifLetter("J",lang)){
                    checkindexofletter("J", lang);
                }
            }
        });

        letterK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterK, false);
                if (ifLetter("K",lang)){
                    checkindexofletter("K", lang);
                }
            }
        });

        letterL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterL, false);
                if (ifLetter("L",lang)){
                    checkindexofletter("L", lang);
                }
            }
        });

        letterM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterM, false);
                if (ifLetter("M",lang)){
                    checkindexofletter("M", lang);
                }
            }
        });

        letterN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterN, false);
                if (ifLetter("N",lang)){
                    checkindexofletter("N", lang);
                }
            }
        });

        letterO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterO, false);
                if (ifLetter("O",lang)){
                    checkindexofletter("O", lang);
                }
            }
        });

        letterP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterP, false);
                if (ifLetter("P",lang)){
                    checkindexofletter("P", lang);
                }
            }
        });

        letterR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterR, false);
                if (ifLetter("R",lang)){
                    checkindexofletter("R", lang);
                }
            }
        });

        letterS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterS, false);
                if (ifLetter("S",lang)){
                    checkindexofletter("S", lang);
                }
            }
        });

        letterT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterT, false);
                if (ifLetter("T",lang)){
                    checkindexofletter("T", lang);
                }
            }
        });

        letterU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterU, false);
                if (ifLetter("U",lang)){
                    checkindexofletter("U", lang);
                }
            }
        });

        letterW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterW, false);
                if (ifLetter("W",lang)){
                    checkindexofletter("W", lang);
                }
            }
        });

        letterX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterX, false);
                if (ifLetter("X",lang)){
                    checkindexofletter("X", lang);
                }
            }
        });

        letterY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterY, false);
                if (ifLetter("Y",lang)){
                    checkindexofletter("Y", lang);
                }
            }
        });

        letterZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterZ, false);
                if (ifLetter("Z",lang)){
                    checkindexofletter("Z", lang);
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

    public Boolean ifLetter(CharSequence letter, Boolean lang) {
        if (!lang) {
            if (PLWords[IntwordPL].contains(letter)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (ENGWords[IntwordPL].contains(letter)) {
                return true;
            } else {
                return false;
            }
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