/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Software Design & Testing
 * Lec8 S40 - JUnit
 */

package com.ait.cat;

public class Cat {
	private String name;
	private int age;
	private String colour;

	public Cat(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
