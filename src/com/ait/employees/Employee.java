/*
 * Joe O'Regan
 * A00258304
 * 01/08/2018
 */
package com.ait.employees;

public class Employee {
	private String ppsNumber;
	private String name;
	private int age;

	public Employee(String ppsNumber, String name, int age) {
		this.ppsNumber = ppsNumber;
		this.name = name;
		this.age = age;
	}

	public String getPpsNumber() {
		return ppsNumber;
	}

	public void setPpsNumber(String ppsNumber) {
		this.ppsNumber = ppsNumber;
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
}
