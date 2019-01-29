package com.example.monhumeur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    private ImageButton mPlayButton1;
    private ImageButton mPlayButton2;
    private ImageButton mPlayButton3;
    private ImageButton mPlayButton4;
    private ImageButton mPlayButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlayButton1 = (ImageButton) findViewById(R.id.TresBonneHumeur);
        mPlayButton2 = (ImageButton) findViewById(R.id.BonneHumeur);
        mPlayButton3 = (ImageButton) findViewById(R.id.HumeurNormale);
        mPlayButton4 = (ImageButton) findViewById(R.id.MauvaiseHumeur);
        mPlayButton5 = (ImageButton) findViewById(R.id.TresMauvaiseHumeur);

        mPlayButton1.setOnClickListener(new View.OnClickListener() {
         String smiley = "TresBonneHumeur";
         String color = "#FFFF00";
            @Override

            public void onClick(View v) {



                // The user just clicked

            }

            public String getSmiley() {
                return smiley;
            }

            public String getColor() {
                return color;
            }
        });

        mPlayButton2.setOnClickListener(new View.OnClickListener() {
            String smiley = "BonneHumeur";
            String color = "#58FA82";
            @Override

            public void onClick(View v) {



                // The user just clicked

            }

            public String getSmiley() {
                return smiley;
            }

            public String getColor() {
                return color;
            }
        });

        mPlayButton3.setOnClickListener(new View.OnClickListener() {
            String smiley = "HumeurNormale";
            String color = "#B0C4DE";
            @Override

            public void onClick(View v) {



                // The user just clicked

            }

            public String getSmiley() {
                return smiley;
            }

            public String getColor() {
                return color;
            }
        });

        mPlayButton4.setOnClickListener(new View.OnClickListener() {
            String smiley = "MauvaiseHumeur";
            String color = "#DCDCDC";
            @Override

            public void onClick(View v) {



                // The user just clicked

            }

            public String getSmiley() {
                return smiley;
            }

            public String getColor() {
                return color;
            }
        });

        mPlayButton5.setOnClickListener(new View.OnClickListener() {
            String smiley = "TresMauvaiseHumeur";
            String color = "#F08080";
            @Override

            public void onClick(View v) {



                // The user just clicked

            }

            public String getSmiley() {
                return smiley;
            }

            public String getColor() {
                return color;
            }
        });

    }
}