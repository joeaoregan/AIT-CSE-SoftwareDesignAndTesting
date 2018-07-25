/* 
 * Joe O'Regan
 * A00258304
 * 03/07/2018
 * 
 * Types
 */

package com.ait.wk2;

public class Example {

	public static void main(String[] args) {
		int x = 5;
		double y = 6.7;
		// Implicit cast
		/*
		 * y=x; System.out.println("y is " + y); System.out.println("x is " + x);
		 */
		// x=y; //error
		// Explicit cast
		x = (int) y;
		System.out.println("x is " + x);
	}

}
