package com.syntax.Reviewclass04;

public class NestedLoopsDemo2 {

		//test case below (dont change):
		public static void main(String[] args) {
			String firstValue = mixString("12345", "abcde");
			System.out.println(firstValue);
		}

		static String mixString(String s1, String s2) {
			String returnedString = "";
			for (int i = 0; i < s1.length(); i++) {
				returnedString = returnedString + s1.charAt(i) + s2.charAt(i);
			}
			return returnedString;
		}
	}



/*

	public static void main(String[] args) {
		// TODO Auto-generated method stub
*/

	/*	*//*for(int y=1;y<=3; y++) {

			for(int x=1;x<=2;x++) {
				System.out.println(x);
			}
*//*
			int [] array=new int[3];
			array[0]=19;
			array[1]=21;
			array[2]=28;
			int count=0;
			for(int i=0; i<array.length; i++ ){
				count=count+array[i];

			}
		System.out.println(count);*/


		/*int[] array2 = {1,2,3,4,5,6,7,8,9,10};
		int count2  = 0;
		for(int item: array2){
			count2 += array2[item];
			System.out.println(count2);
			*/







