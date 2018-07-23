/* 
 * Joe O'Regan
 * 03/07/2018
 * A00258304
 * 
 * Lecture 3
 */

package com.ait.wk2;

import java.text.NumberFormat;
import java.util.Locale;

public class Example2 {
	public static void main(String args[]) {
		// L3S36 Currency format
		// double price = 11.575;// Rounds down
		double price = 11.578; // Rounds up

		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.ITALY);
		String priceString = currency.format(price);
		System.out.println(priceString);

		// percent format
		double majority = .505;
		NumberFormat percent = NumberFormat.getPercentInstance();
		String majorityString = percent.format(majority); // returns 50%
		System.out.println(majorityString);

		// L3S27 number format
		double miles = 15341.253;
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(1);
		String mileString = number.format(miles); // returns 15,341.3
		System.out.println(mileString);

		String majorityString2 = NumberFormat.getPercentInstance().format(majority);
		System.out.println(majorityString2);

		// Math.pow()
		int result = (int) Math.pow(2, 5); // has to be explicitly cast
		System.out.println(result);

		// random number
		double x = Math.random();
		System.out.println(x);
		long result2 = (long) x;
		System.out.println(result2);

		for (int i = 0; i < 5; i++) {
			double x2 = Math.random() * 100; // Random number between 0 and 100
			System.out.println(x2);
		}
	}
}
