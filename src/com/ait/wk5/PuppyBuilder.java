/*
 * Joe O'Regan
 * A00258304
 * 23/07/2018
 * 
 * Tutorialspoint: Objects and Classes
 * 1 class creates 3 objects
 */
package com.ait.wk5;

public class PuppyBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Construct Puppy 1
		Puppy spot = new Puppy("Spot");
		spot.setAge(5); // Set his age
		spot.getAge(); // Get his age
		
		int spotsAge = spot.getAge();
		System.out.println("The Dogs Age is: " + spotsAge);

		// Construct Puppy 2
		Puppy dora = new Puppy("Dora");
		dora.setAge(6);
		dora.getAge();

		// Construct Puppy 3
		Puppy spike = new Puppy("Spike");
		spike.setAge(4);
		spike.getAge();
	}

}
