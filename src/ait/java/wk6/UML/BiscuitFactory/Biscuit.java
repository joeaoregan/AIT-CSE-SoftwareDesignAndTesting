/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 * Java: UML Exercises - 4 Biscuit Factory
 */

package ait.java.wk6.UML.BiscuitFactory;

public class Biscuit {
	private static int numberOfBiscuits;
	private int weight;
	private String brand;
	private String maker;

	public Biscuit() {
		numberOfBiscuits++;
	}
	public Biscuit(String maker, String brand, int weight) {
		this.maker = maker;
		this.brand = brand;
		this.weight = weight;
		numberOfBiscuits++;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public static int getNumberOfBiscuits() {
		return numberOfBiscuits;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	@Override
	public String toString() {
		return ("Biscuit [Maker="+maker+
				", brand="+brand+
				", weight="+weight
				+"]");
	}
	public boolean isOutOfDate() {
		return true;
	}
}
