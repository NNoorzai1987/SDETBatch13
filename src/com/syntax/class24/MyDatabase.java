package com.syntax.class24;

public  abstract class  MyDatabase {

    abstract void open();

    abstract String name(String str);

    abstract int num(int num);

    abstract boolean check(boolean che);

    public void close() {
        System.out.println("after the completion of first task please close the database");
    }
}
 class blueteckit extends MyDatabase{
    @Override
    void open() {
        System.out.println("Please open your JDK in order to complete your task");
    }


    @Override
    String name(String str) {
        System.out.println("After the completion of your first task please tell Mr. "+str+" to check the main code as well");
        return str;
    }

    @Override
    int num(int num) {
        System.out.println("Today we complete about "+num+" codes");
        return num;
    }

    @Override
    boolean check(boolean ch) {
        System.out.println("Please check the QA task ("+ch+")");
        return ch;
    }
}
class greenteckit extends MyDatabase{
    @Override
    void open() {

    }

    @Override
    String name(String str) {
        System.out.println("Weldon Mr. "+str+" you have done a great job today");
        return str;
    }

    @Override
    int num(int num) {
        System.out.println("Nice work bro you have done "+num+" task so far ");
        return num;
    }

    @Override
    boolean check(boolean fas) {
        System.out.println("Please check the ticket ("+fas+")");
        return fas;
    }
}