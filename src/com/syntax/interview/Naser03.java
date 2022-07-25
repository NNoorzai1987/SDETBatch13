package com.syntax.interview;

import java.util.HashMap;

public class Naser03 {
    public static void main(String[] args) {
        String str= "I am Learning java";
        int count;
        char ch;
        HashMap<Character,Integer> hashMap =new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            if (hashMap.containsKey(ch)){
                count = hashMap.get(ch);
                count++;
                hashMap.replace(ch,count);
            }else {
                hashMap.put(ch,1);
            }
        }
        for (Character key : hashMap.keySet()){
            System.out.println(key+"="+hashMap.get(key));
        }
    }
}

