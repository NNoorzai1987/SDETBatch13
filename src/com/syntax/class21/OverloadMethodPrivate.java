package com.syntax.class21;

public class OverloadMethodPrivate {
   // Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with
    // specific arguments and observe result.
    private String Print1(String word, String Name){
        return word+" "+Name;
    }
    private int Print1(int i, int x) {
        return i*x;
    }
    private long Print2(double d, long g){
        return (long) (d+g);
    }
      public static void main(String[] args) {
       OverloadMethodPrivate Object=new OverloadMethodPrivate();
       System.out.println(Object.Print1("Hello","Tom"));
       System.out.println(Object.Print1(5,10));
       System.out.println(Object.Print2(245.25,125));
    }
}
