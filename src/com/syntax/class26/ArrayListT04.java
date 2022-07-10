package com.syntax.class26;
import java.util.ArrayList;
public class ArrayListT04 {
    /*Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.*/
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("sportdrink");
        drinks.add("cook+");
        drinks.add("Taqela");
        drinks.add("fonta");
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.remove(i);
                drinks.add(i, "Water");
            }
        }
        System.out.println(drinks);}}
