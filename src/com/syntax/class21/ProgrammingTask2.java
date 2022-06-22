package com.syntax.class21;

public class ProgrammingTask2 {
    /*
    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the
    message "I love programming languages" should be printed. If some String is passed to it, then in place of
    "programming languages" the value variable should be printed. Example, if we pass "Java", then "I love Java"
    should be printed.
     */
    ProgrammingTask2(){
        System.out.println("I love programming languages");
    }
    ProgrammingTask2(String str){
        System.out.println("I love "+str);
    }

    public static void main(String[] args) {
        ProgrammingTask2 object=new ProgrammingTask2();
        ProgrammingTask2 object2=new ProgrammingTask2("Java");
    }
}