package com.syntax.class23;

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
class Test {
    public static void main(String[] args) {
        ShoppingStore item1 = new ShoppingStore("Blanket", 49.99, 2);
        ShoppingStore item2 = new ShoppingStore("Mattress", 439.18, 1);
        double item1Price = item1.itemTotalPrice();
        System.out.println(item1 + " Total Value " + item1Price);
        double item2Price = item2.itemTotalPrice();
        System.out.println(item1 + " Total Value " + item2Price);
        System.out.println("You purchased " + item1Price + item2Price + " Today");


    }
}

