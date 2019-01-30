package com.example.monhumeur;

import java.util.HashMap;
import java.util.Map;



public class User {

    String color;

    Map<String, String> humeur = new HashMap<String, String>();

    public void addUser(String smiley, String color) {

        this.humeur.put(smiley, color);

    }

}
