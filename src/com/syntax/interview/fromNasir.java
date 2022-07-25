package com.syntax.interview;

public class fromNasir {
    public static void main(String[] args) {
        // How to find duplicates in the array
        int [] arr={1,1,2,2,4,6,7,6,5,9,9,10,10,};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println("The Duplicate Element is: "+arr[j]);
                }
            }
        }
    }
}
