package com.syntax.class26;
import java.util.ArrayList;
public class ArrayListT02 {
    public static void main(String[] args) {
       /* Create an arraylist of cars and retrieve all the values using 3 different ways.*/
        ArrayList<String> vehicle =new ArrayList<>();
        vehicle.add("Lexus");
        vehicle.add("Jaguar");
        vehicle.add("Ferrari");

        System.out.println(vehicle);

        System.out.println(vehicle.clone());

        for (String s : vehicle) {

            System.out.println(s);}
    }}
