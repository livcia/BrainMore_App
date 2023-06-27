package com.example.brainmoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WordGame extends AppCompatActivity {
    Random rand;

    String[] easy_adding_WordsPL = new String[] {
            "CHEMIA",
            "DELFIN",
            "FIGURA",
            "LOSOWE",
            "ABSURD",
            "AFRYKA",
            "BABCIA",
            "AMELIA",
            "ANONIM",
            "ARBUZY",
            "ARABKI",
            "ARKUSZ",
            "ARONIA",
            "AROMAT"
    };
    List<String> WordsPL = new ArrayList<>(Arrays.asList(easy_adding_WordsPL));

    String[] easy_adding_WordsENG = new String[] {
            "TRUSTY",
            "MISFIT"
    };
    List<String> WordsENG = new ArrayList<>(Arrays.asList(easy_adding_WordsENG));
    TextView[] Letters;
    Button drawWord, letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, letterJ, letterK, letterL, letterM, letterN, letterO, letterP, letterR, letterS, letterT, letterU, letterW, letterX, letterY, letterZ;
    int IntwordPL, index, mistakes, scorepoints;
    Boolean lang;
    TextView l1, l2, l3, l4, l5, l6, WordScore, WordMistake, Numberormistakes, Numberofscore;
    Button[] btnletters;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_game);
        Intent intent = getIntent();
        lang = intent.getBooleanExtra("PL_or_ENG", false);
        rand = new Random();
        drawWord = findViewById(R.id.drawWord);
        WordScore = findViewById(R.id.scoreorpkt);
        WordMistake = findViewById(R.id.mistakesorblad);
        Numberormistakes = findViewById(R.id.numberormistakes);
        Numberofscore = findViewById(R.id.numberofscore);
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        scorepoints = prefs.getInt("score", 0);
        Numberofscore.setText(""+scorepoints);
        if (lang) {
            drawWord.setText("Draw word");
            WordScore.setText("SCORE: ");
            WordMistake.setText("MISTAKES: ");
            IntwordPL = rand.nextInt(WordsENG.size());
        } else {
            drawWord.setText("Losuj slowo");
            WordScore.setText("PKT: ");
            WordMistake.setText("BLEDY: ");
            IntwordPL = rand.nextInt(WordsPL.size());
        }
        mistakes = 0;
        l1 = findViewById(R.id.letter1);
        l2 = findViewById(R.id.letter2);
        l3 = findViewById(R.id.letter3);
        l4 = findViewById(R.id.letter4);
        l5 = findViewById(R.id.letter5);
        l6 = findViewById(R.id.letter6);
        Letters = new TextView[] {
                l1,
                l2,
                l3,
                l4,
                l5,
                l6
        };
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
        btnletters = new Button[]{letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, letterJ, letterK, letterL
                ,letterM, letterN, letterO, letterP, letterR, letterS, letterT, letterU, letterW, letterX, letterY, letterZ
        };
        letterA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterA, false);
                if (lang) {
                    if (ifLetterENG("A")) {
                        checkindexofletter("A");
                    }
                } else {
                    if (ifLetterPL("A")) {
                        checkindexofletter("A");
                    }
                }
            }
        });
        letterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterB, false);
                if (lang) {
                    if (ifLetterENG("B")) {
                        checkindexofletter("B");
                    }
                } else {
                    if (ifLetterPL("B")) {
                        checkindexofletter("B");
                    }
                }
            }
        });
        letterC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterC, false);
                if (lang) {
                    if (ifLetterENG("C")) {
                        checkindexofletter("C");
                    }
                } else {
                    if (ifLetterPL("C")) {
                        checkindexofletter("C");
                    }
                }
            }
        });
        letterD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterD, false);
                if (lang) {
                    if (ifLetterENG("D")) {
                        checkindexofletter("D");
                    }
                } else {
                    if (ifLetterPL("D")) {
                        checkindexofletter("D");
                    }
                }
            }
        });
        letterE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterE, false);
                if (lang) {
                    if (ifLetterENG("E")) {
                        checkindexofletter("E");
                    }
                } else {
                    if (ifLetterPL("E")) {
                        checkindexofletter("E");
                    }
                }
            }
        });
        letterF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterF, false);
                if (lang) {
                    if (ifLetterENG("F")) {
                        checkindexofletter("F");
                    }
                } else {
                    if (ifLetterPL("F")) {
                        checkindexofletter("F");
                    }
                }
            }
        });

        letterG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterG, false);
                if (lang) {
                    if (ifLetterENG("G")) {
                        checkindexofletter("G");
                    }
                } else {
                    if (ifLetterPL("G")) {
                        checkindexofletter("G");
                    }
                }
            }
        });

        letterH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterH, false);
                if (lang) {
                    if (ifLetterENG("H")) {
                        checkindexofletter("H");
                    }
                } else {
                    if (ifLetterPL("H")) {
                        checkindexofletter("H");
                    }
                }
            }
        });

        letterI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterI, false);
                if (lang) {
                    if (ifLetterENG("I")) {
                        checkindexofletter("I");
                    }
                } else {
                    if (ifLetterPL("I")) {
                        checkindexofletter("I");
                    }
                }
            }
        });

        letterJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterJ, false);
                if (lang) {
                    if (ifLetterENG("J")) {
                        checkindexofletter("J");
                    }
                } else {
                    if (ifLetterPL("J")) {
                        checkindexofletter("J");
                    }
                }
            }
        });

        letterK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterK, false);
                if (lang) {
                    if (ifLetterENG("K")) {
                        checkindexofletter("K");
                    }
                } else {
                    if (ifLetterPL("K")) {
                        checkindexofletter("K");
                    }
                }
            }
        });

        letterL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterL, false);
                if (lang) {
                    if (ifLetterENG("L")) {
                        checkindexofletter("L");
                    }
                } else {
                    if (ifLetterPL("L")) {
                        checkindexofletter("L");
                    }
                }
            }
        });

        letterM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterM, false);
                if (lang) {
                    if (ifLetterENG("M")) {
                        checkindexofletter("M");
                    }
                } else {
                    if (ifLetterPL("M")) {
                        checkindexofletter("M");
                    }
                }
            }
        });

        letterN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterN, false);
                if (lang) {
                    if (ifLetterENG("N")) {
                        checkindexofletter("N");
                    }
                } else {
                    if (ifLetterPL("N")) {
                        checkindexofletter("N");
                    }
                }
            }
        });

        letterO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterO, false);
                if (lang) {
                    if (ifLetterENG("O")) {
                        checkindexofletter("O");
                    }
                } else {
                    if (ifLetterPL("O")) {
                        checkindexofletter("O");
                    }
                }
            }
        });

        letterP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterP, false);
                if (lang) {
                    if (ifLetterENG("P")) {
                        checkindexofletter("P");
                    }
                } else {
                    if (ifLetterPL("P")) {
                        checkindexofletter("P");
                    }
                }
            }
        });

        letterR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterR, false);
                if (lang) {
                    if (ifLetterENG("R")) {
                        checkindexofletter("R");
                    }
                } else {
                    if (ifLetterPL("R")) {
                        checkindexofletter("R");
                    }
                }
            }
        });

        letterS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterS, false);
                if (lang) {
                    if (ifLetterENG("S")) {
                        checkindexofletter("S");
                    }
                } else {
                    if (ifLetterPL("S")) {
                        checkindexofletter("S");
                    }
                }
            }
        });

        letterT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterT, false);
                if (lang) {
                    if (ifLetterENG("T")) {
                        checkindexofletter("T");
                    }
                } else {
                    if (ifLetterPL("T")) {
                        checkindexofletter("T");
                    }
                }
            }
        });

        letterU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterU, false);
                if (lang) {
                    if (ifLetterENG("U")) {
                        checkindexofletter("U");
                    }
                } else {
                    if (ifLetterPL("U")) {
                        checkindexofletter("U");
                    }
                }
            }
        });

        letterW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterW, false);
                if (lang) {
                    if (ifLetterENG("W")) {
                        checkindexofletter("W");
                    }
                } else {
                    if (ifLetterPL("W")) {
                        checkindexofletter("W");
                    }
                }
            }
        });

        letterX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterX, false);
                if (lang) {
                    if (ifLetterENG("X")) {
                        checkindexofletter("X");
                    }
                } else {
                    if (ifLetterPL("X")) {
                        checkindexofletter("X");
                    }
                }
            }
        });

        letterY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterY, false);
                if (lang) {
                    if (ifLetterENG("Y")) {
                        checkindexofletter("Y");
                    }
                } else {
                    if (ifLetterPL("Y")) {
                        checkindexofletter("Y");
                    }
                }
            }
        });

        letterZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blockButton(letterZ, false);
                if (lang) {
                    if (ifLetterENG("Z")) {
                        checkindexofletter("Z");
                    }
                } else {
                    if (ifLetterPL("Z")) {
                        checkindexofletter("Z");
                    }
                }
            }
        });
        drawWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mistakes = 0;
                Numberormistakes.setText(""+mistakes);
                rand = new Random();
                if(lang){
                    WordsENG.remove(IntwordPL);
                    IntwordPL = rand.nextInt(WordsENG.size());
                }else{
                    WordsPL.remove(IntwordPL);
                    IntwordPL = rand.nextInt(WordsPL.size());
                }
                for (int i = 0; i< btnletters.length; i++){
                    blockButton(btnletters[i], true);
                }
                Integer index = 0;
                while (index < Letters.length) {
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
        String ltr = WordsENG.get(IntwordPL);
        if (ltr.contains(letter)) {
            return true;
        } else {
            mistakes += 1;
            Numberormistakes.setText(""+mistakes);
            return false;
        }
    }
    public Boolean ifLetterPL(CharSequence letter) {
        String ltr = WordsPL.get(IntwordPL);
        if (ltr.contains(letter)) {
            return true;
        } else {
            mistakes += 1;
            Numberormistakes.setText(""+mistakes);
            return false;
        }
    }
    public void showletter(Integer index, String letter) {
        Letters[index].setText(letter);
    }
    public void checkindexofletter(String letter) {
        if (!lang) {
            index = WordsPL.get(IntwordPL).indexOf(letter);
            while (index >= 0) {
                showletter(index, letter);
                if(checkTextView()){
                    scorepoints = scorepoints + 100 - (mistakes*10);
                    if(scorepoints < 0){
                        scorepoints = 0;
                    }
                    mistakes = 0;
                    Numberofscore.setText(""+scorepoints);
                    editor = getSharedPreferences("prefs", MODE_PRIVATE).edit();
                    editor.putInt("score", scorepoints);
                    editor.apply();
                    Toast.makeText(getApplicationContext(), "gratulacje", Toast.LENGTH_SHORT).show();
                }
                index = WordsPL.get(IntwordPL).indexOf(letter, index + 1);
            }
        } else {
            index = WordsENG.get(IntwordPL).indexOf(letter);
            while (index >= 0) {
                showletter(index, letter);
                if(checkTextView()){
                    scorepoints = scorepoints + 100 - (mistakes*10);
                    if(scorepoints < 0){
                        scorepoints = 0;
                    }
                    mistakes = 0;
                    Numberofscore.setText(""+scorepoints);
                    editor = getSharedPreferences("prefs", MODE_PRIVATE).edit();
                    editor.putInt("score", scorepoints);
                    editor.apply();
                    Toast.makeText(getApplicationContext(), "CONGRATULATIONS", Toast.LENGTH_SHORT).show();
                }
                index = WordsENG.get(IntwordPL).indexOf(letter, index + 1);
            }
        }
    }
    public void clickEvent(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public boolean checkTextView() {
        for (int i = 0; i< Letters.length; i++){
           if (Letters[i].getText().toString().equals("_")){
                return false;
            }
        }
        for (int i = 0; i< btnletters.length; i++){
            blockButton(btnletters[i], false);}
        return true;
    }
}