/*
 * Joe O'Regan
 * A00258304
 * 25/07/2018
 * 
 * Software Development & Testing 
 * JUnit Lab 2
 */

package com.ait.wk5.cat;

public class DiscountCalculator {
	Double discount = 0.0, total = 0.0;

	public Double discountCalculator(char customerType, double subtotal) {

		switch (Character.toUpperCase(customerType)) {
		case 'G':
			if (subtotal >= 250) {
				discount = 0.2;
			} else if (subtotal >= 100 && subtotal < 250) {
				discount = 0.1;
			} else if (subtotal < 100) {
				discount = 0.05;
			}
			break;
		case 'S':
			if (subtotal >= 200) {
				discount = 0.1;
			} else if (subtotal >= 100 && subtotal < 200) {
				discount = 0.05;
			} else if (subtotal < 100) {
				discount = 0.0;
			}
			break;
		case 'B':
			if (subtotal >= 300) {
				discount = 0.05;
			} else if (subtotal < 300) {
				discount = 0.0;
			}
			break;
		default:
			break;
		}

		total = subtotal * (1.0 - discount);
		return total;
	}
}
