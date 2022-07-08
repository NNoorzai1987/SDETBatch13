package com.syntax.interview;

public class interviewQuestion {
    public static void main(String[] args) {
        System.out.println(reverse("I am a java Programmer"));

    }
    public static String reverse (String strToRev){
      String[] strArray = strToRev.split(" ");
      for (int i = strArray.length - 1; i >= 0; i--) {
       System.out.print(strArray[i] + " ");}
            return strToRev;
        }
    }