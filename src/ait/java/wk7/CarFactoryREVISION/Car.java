/*
 * Joe O'Regan
 * A00258304
 * 07/08/2018
 * Java: Car Factory (Revision)
 */
package ait.java.wk7.CarFactoryREVISION;

public class Car {
	private String registration;
	private int numberOfCars;
	private String model;
	private String make;
	private String color;
	private int kilometers;
	
	public Car(String registration, String model, String make, String color) {
		this.registration = registration;
		this.model = model;
		this.make = make;
		this.color = color;
		this.kilometers = 0;
	}
	
	public String getRegistration() {
		return registration;
	}
	
	public int getKilometers() {
		return kilometers;		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	public int getNumberOfCars() {
		return numberOfCars;
	}
	
	@Override
	public String toString() {
		return "Car Details [Reg="+ this.registration+ "], make="+make+", model="+model+",color="+color+", kilometers="+kilometers+"]";
	}
}
