/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 * Java: UML Exercises - 4 Biscuit Factory
 */
package com.ait.wk6.UML.BiscuitFactory;

public class BiscuitFactory {

	public static void main(String[] args) {
		Biscuit biscuitOne = new Biscuit();
		biscuitOne.setBrand("Kimberly");
		biscuitOne.setMaker("Jacobs");
		biscuitOne.setWeight(15);
		
		System.out.println(biscuitOne.toString());
		
		Biscuit biscuitTwo = new Biscuit("McVities","Digestive",20);
	
		System.out.println(biscuitTwo.toString());

		biscuitTwo.setBrand("Cadburys");
		biscuitTwo.setMaker("Wholewheat");
		biscuitTwo.setWeight(25);
		
		System.out.println(biscuitTwo.toString());
		
		System.out.println(Biscuit.getNumberOfBiscuits());
	}

}
