/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 * Lecture 5 OOP Notes
 */
package ait.java.wk5.e5A;

public class Rock2 {
	private static int numRocks;// belongs to class
	private int rockCode;// assign a code

	public Rock2(int rockCode) {
		this.rockCode = rockCode;
		numRocks++;
		System.out.println("Creating Rock...");
	}

	public int getRockCode() {
		return rockCode;
	}

	public static int getNumRocks() {
		return numRocks;
	}
	
	@Override
	public String toString() {
		return ("Code is " + rockCode);
	}
}
