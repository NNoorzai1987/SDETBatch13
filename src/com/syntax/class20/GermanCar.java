package com.syntax.class20;

public class GermanCar {
 String name="BMW";
 String model="X6";

    }
    class bmw extends GermanCar {
        public void printInfo(){
            System.out.println(name+" "+model);
        }

        public static void main(String[] args) {
            bmw bm=new bmw();
            bm.printInfo();
        }
    }


