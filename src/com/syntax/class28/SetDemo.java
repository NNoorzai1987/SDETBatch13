package com.syntax.class28;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        /*
        Set:
        1) Duplicates are not allowed
        We will be discussing three types of sets:
           1) HashSet 2) LinkedHashset  3) TreeSet
            HashSet:
            Upside:it is the fastest of all
            Downside:No Insertion order is maintained
         */

        HashSet<String> fruit=new HashSet<>();
        fruit.add("mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Orange");
        System.out.println(fruit);


    }
}
