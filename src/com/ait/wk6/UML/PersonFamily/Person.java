/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 * Java: UML Exercises - 2 Person Family
 */
package com.ait.wk6.UML.PersonFamily;

public class Person {
	private int age;
	private String name;
	private String address;
	private static int count = 0;

	public Person(int age, String name, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static int getCount() {
		return count;
	}
}
