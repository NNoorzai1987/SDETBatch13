package com.syntax.class31;

import java.util.Iterator;
import java.util.TreeSet;

public class Quiz {
    public static void main(String[] args) {
        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator it = map.iterator();
        while (it.hasNext() )
        {
            System.out.print( it.next() + " " );
        }
    }
}
