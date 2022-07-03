package com.syntax.class24;

public class ShoppingStore {
    String item;
    double price;
    int quantity;

    ShoppingStore(String item,double price,int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    double itemTotalPrice(){
        return price*price;


    }
}

class Main {
    public static void main(String[] args){
        ShoppingStore item1=new ShoppingStore("Blanket",49.99,2);
        ShoppingStore item2=new ShoppingStore("Mattress",439.18,1);
        item1.itemTotalPrice();

        



    }
}
