/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Constructors 4
 */
package com.ait.wk5.constuctors;

public class Overloading {

	public static void main(String[] args) {
		Tree beech = new Tree(); // default constructor
		System.out.println(beech.getType());
		Tree oak = new Tree("Oak");
		System.out.println(oak.getType());
		System.out.println(beech.getType("The tree type is "));

	}

}
