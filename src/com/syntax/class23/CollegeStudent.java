package com.syntax.class23;

public class CollegeStudent extends Student{
    @Override
    public void student() {
        System.out.println("College student must study hard in order pass their exams");
    }

    @Override
    public void student1() {
        System.out.println("College student must do their assignments in order to good score");
    }

    @Override
    public void student2() {
        System.out.println("College students always want to have football after their last hour of lecture");
    }
}
