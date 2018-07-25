/*
 * Joe O'Regan
 * A00258304
 * 26/06/2018
 */
package com.ait.wk1;

import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		String continueStr = "y";
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Invoice Total Calculator");

		// while (continueStr.equals("y")) {
		while (continueStr.equalsIgnoreCase("y")) {
			System.out.println("Enter Numerical Grade: ");
			input = sc.nextInt();
			System.out.print("Letter grade: ");

			if (input >= 85) {
				System.out.println("A");
			} else if (input >= 70) {
				System.out.println("B");
			} else if (input >= 55) {
				System.out.println("C");
			} else if (input >= 40) {
				System.out.println("D");
			} else if (input < 40) {
				System.out.println("Failed");
			}

			System.out.println("continue y/n: ");
			continueStr = sc.next();
		}

		sc.close();
	}

}
