package com.syntax.class28;
import java.util.LinkedHashSet;
public class SetOfCitiesTask {
    /*Create a Set of cities in which you want to make sure that
     insertion order is maintained. Then remove any city that starts with “A”;*/
    public static void main(String[] args) {
        LinkedHashSet<String>  cities=new LinkedHashSet<>();
        cities.add("San Francisco");
        cities.add("Anshun");
        cities.add("Antalya");
        cities.add("San Rafael");
        cities.add("Aligarh");
        cities.add("San Mateo ");
        cities.add("Amsterdam");
        System.out.println(cities);
        System.out.println("_____________________________________");
        cities.removeIf( nat -> nat.startsWith("A"));
        System.out.println(cities);}}
