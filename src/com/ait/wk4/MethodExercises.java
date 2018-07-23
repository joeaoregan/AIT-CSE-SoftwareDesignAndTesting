/*
 * Joe O'Regan
 * A00258304
 * 19/07/2018
 */

package com.ait.wk4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MethodExercises {

	public static void main(String[] args) {
		/*
		 * if (didOswaldActAlone()) { System.out.println("Oswald acted alone"); } else {
		 * System.out.println("Oswald did not act alone"); }
		 */
		// System.out.println(filmRating());
		// swimmerRating();

		System.out.println("main::swimmersCountry is " + swimmerRating());
	}

	static boolean didOswaldActAlone() {
		Scanner sc = new Scanner(System.in);
		Boolean returnValue = true;

		System.out.print("Did Oswald Act Alone? ");
		String response = sc.next();

		if (response.equalsIgnoreCase("true")) {
			returnValue = true;
		} else if (response.equalsIgnoreCase("false")) {
			returnValue = false;
		}

		sc.close();

		return returnValue;
	}

	static String filmRating() {
		Scanner sc = new Scanner(System.in);

		String filmName = "";
		int filmRating = 0;

		try {
			System.out.print("Enter film name: ");
			filmName = sc.next();
			System.out.print("Enter film rating: ");
			filmRating = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Input exception");
			e.printStackTrace();
		}
		sc.close();

		return ("The movie " + filmName + " is rated " + filmRating);
	}

	static String swimmerRating() {
		Scanner sc = new Scanner(System.in);

		String swimmerName = "";
		double diveRating = 0.0;

		try {
			System.out.print("Please enter the swimmers name: ");
			swimmerName = sc.nextLine();
			System.out.print("Please enter the swimmers rating: ");
			diveRating = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Input Exception");
			e.printStackTrace();
		}

		System.out.println("Swimmer is: " + swimmerName);
		System.out.println("Swimmer rating is: " + diveRating);

		return getSwimmersCountry(swimmerName);

		// sc.close();
	}

	static String getSwimmersCountry(String name) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter " + name + " country: ");
		String input = sc.nextLine();
		sc.close();
		
		return input;
	}
}
