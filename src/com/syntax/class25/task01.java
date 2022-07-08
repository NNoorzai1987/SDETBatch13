package com.syntax.class25;

public class task01 {
    /*Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.*/}

 interface Shape {void calculateArea(); void calculateParameter();}

 class Circle implements Shape{@Override public void calculateArea(){System.out.println("The Area of a circle is "+3.14*36);}

     @Override public void calculateParameter() {System.out.println("The parameter size is "+2*3.14*6);}}

 class Square implements Shape{@Override public void calculateArea() { System.out.println("The are of square "+4*4);}

   @Override public void calculateParameter() {System.out.println("The Parameter of square size is "+2*4);}}

 class Testcode1{
     public static void main(String[] args) {
         Shape []shapes={new Circle(),new Square()};
         for (Shape shp:shapes){ shp.calculateArea(); shp.calculateParameter();
       }}}