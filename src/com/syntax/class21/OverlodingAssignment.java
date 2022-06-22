package com.syntax.class21;

class OverlodingAssignment {
   // Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific
   // arguments and observe result.
     static String str1(String st, String str){
          return st+" "+str;
     }
     static String str1(int i, String name ){
          return i+" "+name;
     }
     static String str1(String item,char c,double price ){
          return item+" Price is "+c+""+price;
    }
     public static void main(String[] args) {
          OverlodingAssignment obj=new OverlodingAssignment();
          System.out.println(obj.str1("John","Smith"));
          System.out.println(obj.str1(1271,"John F. Kennedy Blvd"));
          System.out.println(obj.str1("TV",'$',1955.99));
     }

}
