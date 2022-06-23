package com.syntax.class22;
public class Degree {
/*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes.*/
    void getPrerequiste(){
        System.out.println("To get a degree you need high school diploma");}}
 class Bachelors extends Degree{}
 class Masters extends Degree{
     @Override
     void getPrerequiste()
     { System.out.println("To get a Master degree you need Bachelor's diploma");}
     public static void main(String[] args) {
         Degree degre=new Degree();
         degre.getPrerequiste();
         Bachelors bache=new Bachelors();
         bache.getPrerequiste();
        Masters master=new Masters();
        master.getPrerequiste();
     }
 }

