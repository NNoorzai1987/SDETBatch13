package com.syntax.class10;

public class Task {

	public static void main(String[] args) {

		// From an array of integer elements find the largest number.

		int[] array = { 5, 28, 36, 1, 14, 56, 48, -17 };

		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The largest element is " + max);

		max = array[0];

		for (int num : array) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("The largest element is " + max);
	}
}
