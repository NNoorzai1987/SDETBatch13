package com.syntax.class21;
public class AssignmentTask1 {
  /*  Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
    Use separate class to test your code*/
  static void area(int i){
      System.out.println("Area of the squere is "+(i*i));
  }
    static void area(int i,int x){
        System.out.println("Area of the rectangle is "+(i*x));
    }
    static void area(int i,int x, int y){
        System.out.println("Area of the box is "+(3*i*x+3*i*y+3*x*y));
    }}
class MathTest{
    public static void main(String[] args) {
        AssignmentTask1.area(4);
        AssignmentTask1.area(7,6,6);
        AssignmentTask1.area(5,9);
    }}


