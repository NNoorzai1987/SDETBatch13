package com.syntax.class02;

public class Variables {
    public static void main(String[] args) {
        // part a
/*        String name="Zameer";
        String lastName="Noori";
        char grade='B';
        String city="Falls Church";
        String state="VA";
        long phone=76344763733l;
        System.out.println("My name is "+name+" and "+" my last name is "+lastName);
        System.out.println("I am "+grade+" student");
        System.out.println("I live in "+city+" and "+state);
        System.out.println("And my phone number is "+phone);

        //part b
        grade='A';
        state="Odesskaya Oblast'";
        phone=38063403056l;
        city="Odessa";

        System.out.println("My name is "+name+" "
                + "and I moved to new city "+ city+" and new state"+state+". "
                + "My new phone number is "+phone);*/
        String s=null; System.out.println(s.length());
        int[] a=new int[5]; a[10]=50;
        StringBuffer sb = new StringBuffer("Hello");sb.append("World");System.out.println(sb);
        StringBuffer sb3= new StringBuffer("Hello"); sb3.deleteCharAt(0); System.out.println(sb3);
        StringBuilder sb1=new StringBuilder("Syntax"); sb.append("Solutions"); System.out.println(sb1);
    }

}
