package com.syntax.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FromNaser02 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(13);
        list1.add(12);
        list1.add(13);
        list1.add(15);
        list1.add(12);
        list1.add(12);
        System.out.println(duplicate(list1));
    }
    static int duplicate(List<Integer> numbers){
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if(i!=j && numbers.get(i)==numbers.get(j)){
                    set.add(numbers.get(i));
                }
            }
        }
        return set.size();
    }
}
