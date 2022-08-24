package com.syntax.class20;

public class GrandParent {
    String name="Anyatullah";
    int money=12456000;
}

class Parent extends GrandParent{
void printInfo(){
    System.out.println("Name of my father is "+name+" "+money);
}
}
class Child extends Parent{
    void printInfo(){
        System.out.println("Name of my Grandpa is "+name+" "+money);
    }
}
class GrandChild extends Child{
    void printInfo(){
        System.out.println("My grand grand fathers name is "+name+" He has that much money "+money);
    }

    public static void main(String[] args) {
        GrandChild grandChild=new GrandChild();
        grandChild.printInfo();
        Parent parent=new Parent();
        parent.printInfo();
    }
}

