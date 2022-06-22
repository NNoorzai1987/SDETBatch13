package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello"); // 5

			for (int y = 1; y >= 3; y++) {

				System.out.println("Bye");// 0
			}

		}
		System.out.println(" -------------------");

		/*
		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello");

			for (int y = 1; y <= 3; y--) { //infinite

				System.out.println("Bye");
			}
		}
		*/

		System.out.println(" -------------------");

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello");

			for (int y = 1; y <= 3; y++) {

				System.out.println("Bye");
			}

		}

		System.out.println(" ----------------------------");

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello " +i);

			for (int y = 1; y <= 3; y++) {

				System.out.println("Bye "+y);

				break;
			}

		}
		
		System.out.println("----------------------------");
		
		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello"); 
			
			for (int y = 1; y <= 3; y++) {

				System.out.println("Bye");
				
				continue;

				//System.out.println("Bye");

			}
		}
	}
}
