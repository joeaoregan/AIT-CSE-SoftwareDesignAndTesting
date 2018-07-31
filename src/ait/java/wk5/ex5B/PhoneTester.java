/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Java: UML Exercises - 1 Phone
 */
package ait.java.wk5.ex5B;

public class PhoneTester {

	public static void main(String[] args) {
		Phone samsung = new Phone();
		System.out.println("Details for samsung - defaults");
		System.out.println(samsung.getPhoneNumber());
		System.out.println(samsung.getOwnersName());
		System.out.println(samsung.getPrice());
		Phone iPhone = new Phone("999", "John", 88.50);
		System.out.println("Details for iPhone");
		System.out.println(iPhone.getPhoneNumber());
		System.out.println(iPhone.getOwnersName());
		System.out.println(iPhone.getPrice());
		iPhone.setOwnersName("Tom");
		iPhone.setPhoneNumber("110");
		iPhone.setPrice(110.50);
		System.out.println("Updated details for iPhone");
		System.out.println(iPhone.getPhoneNumber());
		System.out.println(iPhone.getOwnersName());
		System.out.println(iPhone.getPrice());
	}

}
