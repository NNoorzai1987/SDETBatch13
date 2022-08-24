package com.syntax.class14;

public class MethodsDemo2 {


	
	//write a method when called it should print 5 times Batch 13 is great
	void print() {
		for(int i=0; i<10;i++) {
			System.out.println("Batch 13 is great");
		}
	}
		void printManyTimes(int times) {
			for(int i=0; i<times;i++) {
				System.out.println("Tara is great");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo2 md=new MethodsDemo2(); // Creating the object of a class
		md.print();
		md.printManyTimes(3);
	}


}
