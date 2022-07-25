package com.syntax.class28;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
public class Task01 {
    /*How can you remove all duplicates from ArrayList?*/
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        System.out.println("_____________________________________");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet(aList);
        System.out.println(linkedHashSet);

        for(int i=0;i<aList.size();i++){
            for(int j=i+1;j<aList.size();j++){
                if(aList.get(i).equals(aList.get(j))){
                    aList.remove(j); j--;}}}
        System.out.println("_____________________________________");
        System.out.println(aList);}}
