package com.example.monhumeur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {
    private ImageButton mPlayButton1;
    private ImageButton mPlayButton2;
    private ImageButton mPlayButton3;
    private ImageButton mPlayButton4;
    private ImageButton mPlayButton5;

    User humeur = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlayButton1 = (ImageButton) findViewById(R.id.TresBonneHumeur);
        mPlayButton2 = (ImageButton) findViewById(R.id.BonneHumeur);
        mPlayButton3 = (ImageButton) findViewById(R.id.HumeurNormale);
        mPlayButton4 = (ImageButton) findViewById(R.id.MauvaiseHumeur);
        mPlayButton5 = (ImageButton) findViewById(R.id.TresMauvaiseHumeur);

        humeur.addUser("smiley","color");

        mPlayButton1.setOnClickListener(new View.OnClickListener() {
         String smiley = "TresBonneHumeur";
         String color = "#FFFF00";
            @Override

            public void onClick(View v) {
                humeur.addUser(this.smiley,this.color);

                //On instancie notre layout en tant que View
                LayoutInflater factory = LayoutInflater.from(this);
                final View alertDialogView = factory.inflate(R.layout.alertdialogperso, null);

                //Création de l'AlertDialog
                AlertDialog.Builder adb = new AlertDialog.Builder(this);

                //On affecte la vue personnalisé que l'on a crée à notre AlertDialog
                adb.setView(alertDialogView);

                //On donne un titre à l'AlertDialog
                adb.setTitle("Remarque du jour");

                //On affecte un bouton "OK" à notre AlertDialog et on lui affecte un évènement
                adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        //Lorsque l'on cliquera sur le bouton "OK", on récupère l'EditText correspondant à notre vue personnalisée (cad à alertDialogView)
                        EditText et = (EditText)alertDialogView.findViewById(R.id.EditText1);

                        //On affiche dans un Toast le texte contenu dans l'EditText de notre AlertDialog
                        Toast.makeText(MainActivity.this, et.getText(), Toast.LENGTH_SHORT).show();
                    } });

                //On crée un bouton "Annuler" à notre AlertDialog et on lui affecte un évènement
                adb.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //Lorsque l'on cliquera sur annuler on quittera l'application
                        finish();
                    } });
                adb.show();



                // The user just clicked

            }


        });

        mPlayButton2.setOnClickListener(new View.OnClickListener() {
            String smiley = "BonneHumeur";
            String color = "#58FA82";
            @Override

            public void onClick(View v) {

                humeur.addUser(this.smiley,this.color);



                // The user just clicked

            }


        });

        mPlayButton3.setOnClickListener(new View.OnClickListener() {
            String smiley = "HumeurNormale";
            String color = "#B0C4DE";
            @Override

            public void onClick(View v) {
                humeur.addUser(this.smiley,this.color);



                // The user just clicked

            }


        });

        mPlayButton4.setOnClickListener(new View.OnClickListener() {
            String smiley = "MauvaiseHumeur";
            String color = "#DCDCDC";
            @Override

            public void onClick(View v) {
                humeur.addUser(this.smiley,this.color);



                // The user just clicked

            }


        });

        mPlayButton5.setOnClickListener(new View.OnClickListener() {
            String smiley = "TresMauvaiseHumeur";
            String color = "#F08080";
            @Override

            public void onClick(View v) {
                humeur.addUser(this.smiley,this.color);



                // The user just clicked

            }




        });

    }
}
