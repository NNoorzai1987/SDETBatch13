package com.syntax.class25;
public class  Task3 {
  /*  We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B. Create class
    'Marks' with an abstract method 'getAverage' that will be returning the average of marks. Provide implementation of abstract method
    in classes 'A' and 'B'. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as
    its parameters for student B. Test your code*/}
 abstract class Marks{ abstract int getAverage();}
 class A extends Marks{int math;int sport;int English; A(int math,int sport,int English){this.math=math;this.sport=sport;this.English=English;}
    @Override int getAverage() { return math+sport+English/3; }}
class B extends Marks{int math;int sport;int English;int Java;B(int math,int sport,int English, int Java)
 {this.math=math;this.sport=sport;this.English=English;this.Java=Java;}
     @Override int getAverage() { return math+sport+English+Java/4;}}
 class Testcode{
     public static void main(String[] args) {
         Marks []marks= {new A(91, 87, 85),new B(84,93,71,68)};
         for (Marks mrk:marks){System.out.println(mrk.getAverage());}}}