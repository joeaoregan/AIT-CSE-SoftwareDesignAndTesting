/*
 * Joe O'Regan
 * A00258304
 */
package com.ait.golf;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class GolfResort {

	final static Double JUNIOR = 30.1;
	final static Double ADULT = 50.5;
	final static Double SENIOR = 28.4;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double fee = 0.0;
		double discount = 1.0;
		String category = "";
		Boolean validDay = true;

		System.out.println("Welcome to AIT Golf Resort");

		try {
			System.out.println("Input your age -->");
			int age = sc.nextInt();
			System.out.println("How many hours are you booking for?? (Min 1, Max 4) --> ");
			int numHours = sc.nextInt();
			System.out.println("What day of the week are you booking for?-->");
			String dayOfTheWeek = sc.next();

			if (age < 10) {
				System.out.println("You are too young to play golf");
			} else if (numHours < 1 || numHours > 4) {
				System.out.println("Number of hours must be between 1 and 4");
			} else {

				switch (dayOfTheWeek.toLowerCase()) {
				case "mon":
				case "tue":
				case "wed":
				case "thur":
				case "fri":
					discount = 1.0;
					break;
				case "sat":
				case "sun":
					discount = 0.9;
					break;
				default:
					validDay = false;
					System.out.println("Invalid data entered for day of the week");
					break;
				}
				if (validDay) {
					if (age >= 10 && age <= 17) {
						fee = JUNIOR * numHours * discount;
						category = "Junior";
					} else if (age >= 18 && age <= 59) {
						fee = ADULT * numHours * discount;
						category = "Adult";
					} else if (age >= 60) {
						category = "Senior";
						fee = SENIOR * numHours * discount;
					}

					System.out.println("Category: " + category);
					System.out.println("Number of hours: " + numHours);
					System.out.println("Day of the week: " + dayOfTheWeek.toUpperCase());
					NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
					System.out.println("Fee due: " + currency.format(fee));
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Error in input");
		}

		sc.close();
	}

}
