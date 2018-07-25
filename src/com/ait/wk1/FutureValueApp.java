/*
 * Joe O'Regan
 * A00258304
 * 
 * Lec1 S10-12
 */

package com.ait.wk1;

import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {

	public static void main(String[] args) {
		System.out.println("\nWelcome to the Future Value Calculator\n");

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			System.out.print("Enter monthly investment:   ");
			double monthlyInvestment = sc.nextDouble();
			System.out.print("Enter yearly interest rate: ");
			double interestRate = sc.nextDouble();
			System.out.print("Enter number of years:      ");
			int years = sc.nextInt();

			// calculate the future value
			double monthlyInterestRate = interestRate / 12 / 100;
			int months = years * 12;
			double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);

			// format and display the result
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			System.out.println("Future value:               " + currency.format(futureValue) + "\n");

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}

		sc.close();
	}

	private static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months) {
		double futureValue = 0;

		for (int i = 1; i <= months; i++) {
			futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
		}

		return futureValue;
	}
}
