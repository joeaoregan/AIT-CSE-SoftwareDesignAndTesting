/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Lec5 S55
 */
package com.ait.wk5;

import java.awt.Point;

public class PointEg {

	public static void main(String[] args) {
		Point p1 = new Point(); // Default constructor A
		Point p2 = new Point(1, 1); // Constructor B
		Point p3 = new Point(p2); // Constructor C

		System.out.println("Point 1: " + p1);
		System.out.println("Point 2: " + p2);
		System.out.println("Point 3: " + p3);

		p1.move(5, 5);
		System.out.println("Point 1: " + p1);
	}
}
