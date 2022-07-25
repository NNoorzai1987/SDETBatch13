package com.syntax.interview;

public class FromNaser03 {
    //Replit 228
    public static void main(String[] args) {
        System.out.println(countLastWordChar("I love Java"));

    }
    public static int countLastWordChar(String str){
        String [] splitedArray=str.split(" ");
        return splitedArray[splitedArray.length-1].length();
    }
}
