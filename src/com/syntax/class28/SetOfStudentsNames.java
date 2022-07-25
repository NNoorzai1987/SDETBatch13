package com.syntax.class28;

import java.util.HashMap;

public class SetOfStudentsNames {
    /*Create a Set collection that will hold Objects of Student Type. In this set we do
    not care about the insertion order. Each student object should have name and studentID.
     Display name of each student.*/
    public static void main(String[] args) {
        HashMap<String,Integer> Student=new HashMap<>();
        Student.put("Elon Mask",101);
        Student.put("Tom Cruz",102);
        Student.put("Jeffery Adell",103);
        Student.put("Jacobson Roboto",104);
        Student.put("Hiroshi Yakima",105);
        System.out.println(Student.keySet());

    }
}
