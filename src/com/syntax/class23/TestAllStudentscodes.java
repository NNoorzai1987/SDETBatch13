package com.syntax.class23;

public class TestAllStudentscodes {
    public static void main(String[] args) {

        Student student=new Student();student.student();student.student1();student.student2();
        System.out.println();
        Syntaxstudent student1=new Syntaxstudent();student1.student();student1.student1();student1.student2();
        System.out.println();
        CollegeStudent student2=new CollegeStudent();student2.student();student2.student1();student2.student2();
        System.out.println();
        SchoolStudent schoolStudent=new SchoolStudent();schoolStudent.student();schoolStudent.student1();schoolStudent.student2();

    }
}
