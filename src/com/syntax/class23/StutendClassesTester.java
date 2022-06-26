package com.syntax.class23;

public class StutendClassesTester {
    public static void main(String[] args) {
        Student []student={new Syntaxstudent(),new CollegeStudent(),new SchoolStudent()};
        for(int i=0;i<student.length;i++){
            System.out.println();
           student[i].student();
           student[i].student1();
           student[i].student2();

        }

    }
}
