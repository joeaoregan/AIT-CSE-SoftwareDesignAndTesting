/*
 * Joe O'Regan
 * A00258304
 */
package com.ait.wk2;

public class Methods2 {

	public static void main(String[] args) {
		int a = 5;
		if (a == 5) {
			System.out.println("A is 5");
		}

		String name = "John";
		// Doesn't always work for strings
		if (name == "John") {
			System.out.println("Name is John");
		}
		// Should use .equals() method
		if (name.equals("John")) {
			System.out.println("Name is John");
		}
	}
}
