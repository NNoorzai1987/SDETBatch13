package com.syntax.class11;

public class practice {
    public static void main(String[] args) {
        int x=2500;
        int y=3500;
        x=x+y;//2500+3500=6000 stored in x
        y=x-y;// 3500-6000=2500 stored in y
        x=x-y;//2500-6000=3500 stored in x
        System.out.println(x);
        System.out.println(y);
    }
}
