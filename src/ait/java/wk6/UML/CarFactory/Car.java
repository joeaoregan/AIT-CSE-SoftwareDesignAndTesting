/*
 * Joe O'Regan
 * A00258304
 * 31/07/2018
 * Java Lab - UML - 6 Car Factory
 */
package ait.java.wk6.UML.CarFactory;

public class Car {
	private String registration;
	private static int numberOfCars;
	private String model;
	private String make;
	private String colour;
	private int kilometers;

	public Car(String registration) {
		this.registration = registration;
		numberOfCars++;
	}

	public Car(String registration, String model, String make, String colour) {
		this.registration = registration;
		this.model = model;
		this.make = make;
		this.colour = colour;
		this.kilometers = 0;
		numberOfCars++;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}

	@Override
	public String toString() {
		return "Car Details [Reg=" + registration + ", make=" + make + ", model=" + model + ", colour=" + colour
				+ ", kilometers=" + kilometers + "]";
	}
}
