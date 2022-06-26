package com.syntax.class23;

public class SchoolStudent extends Student{
    @Override
    public void student() {
        System.out.println("School students always required to be present in the school every morning at 8 am");
    }

    @Override
    public void student1() {
        System.out.println("School students must do their assignments every night before going to the bed");
    }

    @Override
    public void student2() {
        System.out.println("School students playing soccer three days of the week");
    }
}
