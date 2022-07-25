package com.syntax.class28;

import java.util.TreeSet;

public class SetDemo3 {
     /*Set:
    1) Duplicates are not allowed
    We will be discussing three types of sets:
    1) HashSet 2) LinkedHashset  3) TreeSet
  TreeSet:
    UpSide: Elements will always be in sorted form
    Downside: insertion speed is slowest of all
    Retrieval Speed better than linkedList but slower than Hashset.*/


    public static void main(String[] args) {
        TreeSet<Integer> sortedNumbers=new TreeSet<>();
        sortedNumbers.add(1);
        sortedNumbers.add(10);
        sortedNumbers.add(12);
        sortedNumbers.add(2);
        sortedNumbers.add(3);
        sortedNumbers.add(3);
        System.out.println(sortedNumbers);
    }
}