package com.syntax.class24;

public class TestMyDatabase {
    public static void main(String[] args) {
        MyDatabase myDatabase=new blueteckit();
            myDatabase.open();
            myDatabase.name("John");
            myDatabase.num(5);
            myDatabase.check(true);
            myDatabase.close();
            MyDatabase myDatabase1=new greenteckit();
            myDatabase1.open();
            myDatabase1.name("Smith");
            myDatabase1.num(7);
            myDatabase1.check(true);
            myDatabase1.close();

        }

    }

