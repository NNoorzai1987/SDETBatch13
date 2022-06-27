package com.syntax.class23;

public class Search {

    public void open(){
        System.out.println("First in the morning must open the link for find the code");
    }
    public void chose(int num){
        System.out.println("chose code number "+num+" in order to complete my task");

    }
    public void implement(String URL){
        System.out.println("Must chose this "+URL+" on google to find out more information about code");
    }
    public void close(){
        System.out.println("Now have to close the link");
    }


}
 class stockflow extends Search{
    @Override
     public void open(){
         System.out.println("In the afternoon must open the link for find the code");
     }
     @Override
     public void chose(int num){
         System.out.println("Must chose the code number"+num+" in order to complete my task");

     }
     @Override
     public void implement(String URL){
         System.out.println("Must chose this "+URL+" on Edge to find out more information about code blue");
     }
     @Override
     public void close(){
         System.out.println("Now have to close the link");
     }


 }
 class wwf extends Search{
     public void open(){
         System.out.println(" in the morning must open the youtube to find the the good computation");
     }
     public void chose(int num){
         System.out.println("Will chose code number"+num+" in order to complete my task");

     }
     public void implement(String URL){
         System.out.println("Must chose this "+URL+" on Safari to find out more information about code");
     }
     public void close(){
         System.out.println("Now have to close the link");
     }

 }