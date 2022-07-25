package com.syntax.class28;
import java.util.Iterator;
import java.util.TreeSet;
public class SetCollectionTask {
   /* Create a Set collection in which you need to add names of the countries. In this set we want all objects to be sorted
    in alphabetical order. Using 2 different ways retrieve all elements from set.*/
   public static void main(String[] args) {
       TreeSet<String> countries=new TreeSet<>();
       countries.add("United States Of America");
       countries.add("Afghanistan");
       countries.add("Germany");
       countries.add("Canada");
       countries.add("Brazil");
       countries.add("France");
       System.out.println(countries);
       System.out.println("___________________________________________");
       Iterator<String> iterator=countries.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());}}}
