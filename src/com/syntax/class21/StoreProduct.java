package com.syntax.class21;

class OverlodingAssignment {
 /*  // Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific
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
public class StoreProduct {
    String lable;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    StoreProduct(String lable, double price, String category, boolean hasExpiration, int stock){
        this(lable,price);
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    StoreProduct(String lable, double price, int stock){
        this(lable,price);
        this.stock=stock;
        this.category="misc";
        this.hasExpiration=false;
    }
    StoreProduct(String lable, double price){
        this.lable=lable;
        this.price=price;
        this.stock=0;
    }
    public void display(){
        System.out.print(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock+"\n");
    }
}
class Main {
    public static void main(String[] args) {
        StoreProduct obj = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
        obj.display();
        StoreProduct obj1 = new StoreProduct("Paper Towels", 2.0, 24);
        obj1.display();
        StoreProduct obj2 = new StoreProduct("Paper Towels", 2.0);
        obj2.display();
    }*/
    public static void main(String[] args) {
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software")); //"stwr"
        System.out.println(alphabetical("language"));//"lnug"
    }

    public static String alphabetical(String str) {
        String newStr = "";
        for (int i = 0; i < str.length()-1; i++) {
            if( str.charAt(i)> str.charAt(i+1)){
                newStr=newStr+str.charAt(i);
            };


        }
        return newStr;
    }
}


