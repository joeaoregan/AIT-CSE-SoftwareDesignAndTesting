/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Constructors
 */

package com.ait.wk5.constuctors;

public class SimpleConstructor {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Creating instance " + i + " of Rock");
			Rock rock = new Rock();
		}
		
		Rock rock = new Rock();
		rock.Rock(); // method names should start with lowercase
	}

}
