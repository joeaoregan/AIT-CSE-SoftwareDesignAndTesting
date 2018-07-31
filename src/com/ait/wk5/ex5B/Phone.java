/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Java: UML Exercises - 1 Phone
 */
package com.ait.wk5.ex5B;

public class Phone {
	private String phoneNumber = "123456";
	private String ownersName = "Tom";
	private Double price = 59.99;

	public Phone() {

	}

	public Phone(String phoneNumber, String ownersName, Double price) {
		this.phoneNumber = phoneNumber;
		this.ownersName = ownersName;
		this.price = price;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getOwnersName() {
		return ownersName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPhoneNumber(String aNumber) {
		phoneNumber = aNumber;
	}

	public void setOwnersName(String aOwnersName) {
		ownersName = aOwnersName;
	}

	public void setPrice(Double aPrice) {
		price = aPrice;
	}
}
