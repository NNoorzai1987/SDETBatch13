package com.syntax.class26;
import java.util.ArrayList;
public class ArrayListT03 {
   /* Create an arrayList of words. Remove every word that ends with “e”.*/
   public static void main(String[] args) {

       ArrayList<String> word=new ArrayList<>();
       word.add("Note");
       word.add("Book");
       word.add("Apple");
       word.add("pine");
       System.out.println(word);
       for (int i = 0; i < word.size() ; i++) {
           if(word.get(i).endsWith("e"));
           word.remove(i);
       }
       System.out.println(word);}}
