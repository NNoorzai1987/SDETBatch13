package com.syntax.class01;

public class MyFirstProgram {

    public static void main(String[] args) {

    /*    System.out.println("Hello World");

        System.out.println("Hello Mari");*/
       /* paracticduringclass sd= new paracticduringclass("blue","polish",2,"red");
        sd.printinf()*/;

        String str="noon";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        String reverstr=stringBuilder.toString();
        if(str.equals(reverstr)){
            System.out.println("The  word is palindrome");
        }else {
            System.out.println("The given word is not palindrome ");
        }

    }
}
