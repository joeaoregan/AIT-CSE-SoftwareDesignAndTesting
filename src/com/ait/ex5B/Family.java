/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 * Java: UML Exercises - 2 Person Family
 */

package com.ait.ex5B;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person john;
		Person ann;

		john = new Person(22, "John", "Dublin");
		ann = new Person(25, "Ann", "Galway");

		System.out.println("Details for John");
		System.out.println("Name " + john.getName());
		System.out.println("Address : " + john.getAddress());
		System.out.println("Age : " + john.getAge());

		System.out.println("Details for Ann");
		System.out.println("Name " + ann.getName());
		System.out.println("Address : " + ann.getAddress());
		System.out.println("Age : " + ann.getAge());

		System.out.println("Number of people " + Person.getCount());

		john.setName("Jack");
		john.setAddress("Cork");
		john.setAge(23);
		System.out.println("Updated details for John");
		System.out.println("Name " + john.getName());
		System.out.println("Address : " + john.getAddress());
		System.out.println("Age : " + john.getAge());
	}

}
