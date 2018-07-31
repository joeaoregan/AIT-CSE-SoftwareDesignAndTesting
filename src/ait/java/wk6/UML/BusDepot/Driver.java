/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 * Java Lab: 5 Bus Depot
 */
package ait.java.wk6.UML.BusDepot;

public class Driver {
	private String name;
	private int phoneNumber;

	Driver() {
	}

	Driver(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
