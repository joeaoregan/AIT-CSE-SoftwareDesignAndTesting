/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 * Java Lab: 5 Bus Depot
 */
package com.ait.wk6;

public class Bus {
	private int numberOfSeats;
	private static int busCount;
	private Driver driver;
	private String make;

	public Bus() {
		busCount++;
	}

	public Bus(String make, int numberOfSeats, Driver driver) {
		this.numberOfSeats = numberOfSeats;
		this.driver = driver;
		this.make = make;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public static int getBusCount() {
		return busCount;
	}

	public String toString() {
		String driverName;

		if (driver != null) {
			driverName = " Driver " + driver.getName() + " ";
		} else {
			driverName = " no driver assigned";
		}

		return ("Bus [Make=" + make + ", number of seats=" + numberOfSeats + driverName + "]");
	}
}
