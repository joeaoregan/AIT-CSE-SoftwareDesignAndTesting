/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 * Lecture 5 OOP Notes
 */
package com.ait.ex5A;

public class ConstructorWithArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			Rock2 firstRock = new Rock2(i);
			System.out.println(firstRock.getRockCode());
		}

		System.out.println(Rock2.getNumRocks());
	}

}
