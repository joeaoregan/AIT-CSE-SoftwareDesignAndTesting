/* 
 * Joe O'Regan
 * A00258304
 * 09/07/2018
 */

package com.ait.wk3;

import java.util.Scanner;

public class SwitchExercises {

	public static void main(String[] args) {
		// switchOnAString();
		// switchMonth();
		// switchChar();
		// switchSquareOrCube();
		// switchVowelOrConsonant();
		switchDaysInMonth();
	}

	static void switchOnAString() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		// String gender;
		// Boolean gender;

		System.out.print("Enter a name : ");
		name = sc.next();

		// gender = (name.equals("John")) ? "Male" : "Female";
		// System.out.println((name.equalsIgnoreCase("John")) ? "Male" : "Female");
		// name = name.toLowerCase();

		// switch(name) {
		switch (name.toLowerCase()) {
		case "john":
			System.out.println("Male");
			break;
		case "mary":
			System.out.println("Female");
			break;
		}

		sc.close();
	}

	static void switchMonth() {

		final int JAN = 1;
		final int FEB = 2;
		final int MAR = 3;
		final int APR = 4;
		final int MAY = 5;
		final int JUN = 6;
		final int JUL = 7;
		final int AUG = 8;
		final int SEP = 9;
		final int OCT = 10;
		final int NOV = 11;
		final int DEC = 12;

		Scanner sc = new Scanner(System.in);
		int month = 0;

		System.out.print("Enter a month : ");
		month = sc.nextInt();

		switch (month) {
		case JAN:
			System.out.println("January");
			break;
		case FEB:
			System.out.println("February");
			break;
		case MAR:
			System.out.println("March");
			break;
		case APR:
			System.out.println("April");
			break;
		case MAY:
			System.out.println("May");
			break;
		case JUN:
			System.out.println("June");
			break;
		case JUL:
			System.out.println("July");
			break;
		case AUG:
			System.out.println("August");
			break;
		case SEP:
			System.out.println("September");
			break;
		case OCT:
			System.out.println("October");
			break;
		case NOV:
			System.out.println("November");
			break;
		case DEC:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid month " + month);
			break;
		}

		sc.close();
	}

	static void switchChar() {
		Scanner sc = new Scanner(System.in);

		double num1 = 0.0, num2 = 0.0, result = 0.0;
		String output = "";
		char operation;

		System.out.print("Enter number1 : ");
		num1 = sc.nextDouble();
		System.out.print("Enter number2 : ");
		num2 = sc.nextDouble();
		System.out.print("Enter a char : ");
		operation = sc.next().charAt(0);
		Boolean print = true;

		switch (operation) {
		case '+':
			result = num1 + num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Invalid mathematical operator " + operation);
			print = false;
			break;
		}

		output = Double.toString(num1) + operation + Double.toString(num2) + "=" + result;

		if (print) {
			System.out.println(output);
		}

		sc.close();
	}

	static void switchSquareOrCube() {
		Scanner sc = new Scanner(System.in);

		int n = 0;

		System.out.print("Enter a number (1..10) : ");
		n = sc.nextInt();

		if (n > 0 && n < 11) {
			switch (n % 2) {
			case 0:
				System.out.println(n + " squared is " + (n * n));
				break;
			case 1:
				System.out.println(n + " cubed is " + (n * n * n));
				break;
			}
		} else {
			System.out.println(n + " outside range of 1..10");
		}

		sc.close();
	}

	static void switchVowelOrConsonant() {
		Scanner sc = new Scanner(System.in);
		char input;

		System.out.print("Enter a char : ");
		input = sc.next().charAt(0);

		if (Character.isLetter(input)) {
			switch (Character.toLowerCase(input)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(input + " is a vowel");
				break;
			default:
				System.out.println(input + " is a consonant");
				break;
			}
		} else {
			System.out.println(input + " is invalid input");
		}

		sc.close();
	}

	static void switchDaysInMonth() {
		Scanner sc = new Scanner(System.in);

		int year = 0, month = 0, days = 0;

		System.out.print("Enter year : ");
		year = sc.nextInt();

		System.out.print("Enter month (1..12) : ");
		month = sc.nextInt();

		switch (month) {
		case 9:
		case 4:
		case 6:
		case 11:
			days = 30;
			break;

		case 2:
			days = ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) ? 29
					: 28;
			break;

		default:
			days = 31;
			break;
		}

		System.out.println("Number of days : " + days);

		sc.close();
	}
}
