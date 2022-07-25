package com.syntax.class28;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        /*Set:
    1) Duplicates are not allowed
    We will be discussing three types of sets:
    1) HashSet 2) LinkedHashset  3) TreeSet
    LinkedHashSet:
    Upside:Insertion order is maintained
    DownSide: retrieval of element will be super slow
    insertion speed slower than Hashset; */
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("mango");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Orange");
        System.out.println(fruit);
    }
}
