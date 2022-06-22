package com.syntax.class19;

import com.syntax.class18.Cow;

public class CowTester {
    public static void main(String[] args) {
        Cow cow=new Cow("Australian","Black",
                20,200);
        System.out.println(cow.getCowInfo());

        int x=15;
        x=x;
    }
}
