package com.syntax.class09;

public class Practice {
    public static void main(String[] args) {
      /*  String [] names={"Tom","Smith","Joy","Lie"};*/
       /* for (int i = 0; i < names.length ; i++) {
            if (names[i].equals("Smith")){
                continue;
            }

            System.out.println(names[i]);
        }*/

       /* String [] str=new String[3];
        str[0]="BMW";
        str[1]="Luxes";
        str[2]="Benz";
        *//*str[3]="Audi";*//*
        System.out.println(str[2]);
        int size=str.length;
        System.out.println(size);
        for (int i = 0; i <str.length ; i++) {
            System.out.println(str[i]);*/

            /*int [] num={12,13,18,25};
            int bignumber=num[0];
            for (int j = 0; j <num.length ; j++) {

                if(num[j]>bignumber){
                    bignumber=num[j];

                }
            }
            System.out.println(bignumber);
            */
        String [][]Countries= {
                {"USA", "New York", "Taxes", "California", "Colorado"},
                {"Poland", "Germany", "France", "Nederland", "Afghanistan"},
                {"India","Tajikistan","Russia","Ukraine","Uzbekistan"}};

        for (int i = 0; i <Countries.length ; i++) {
            int sum=0;
            for (int j = 0; j <Countries[i].length ; j++) {

                System.out.println(Countries[i][j]);


            }
        }
        int rows = Countries.length;
        int coloumns = Countries[0]. length;
        System. out. println(rows);
        System. out. println(coloumns);
    }

        }


