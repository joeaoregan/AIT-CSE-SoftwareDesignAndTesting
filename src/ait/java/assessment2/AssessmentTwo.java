/*
 * A00258304
 */
package ait.java.assessment2;

import java.util.Scanner;

public class AssessmentTwo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// multiplicationTableFor();
		// multiplicationTableWhile();
		// oddNumbers();
		// doWhile();
		lotteryOdds();
	}

	static void multiplicationTableFor() {
		System.out.println("Display the multiplication table for ?");
		int input = sc.nextInt();
		for (int i = 1; i <= 12; i++) {
			System.out.println(input + " x " + i + " = " + (input * i));
		}

	}

	static void multiplicationTableWhile() {
		System.out.println("Display the multiplication table for ?");
		int input = sc.nextInt();
		int i = 1;
		while (i < 13) {
			System.out.println(input + " x " + i + " = " + (input * i));

			i++;
		}
	}

	static void oddNumbers() {
		System.out.println("Printing odd Numbers");
		System.out.println("Enter lower limit");
		int lowerLimit = sc.nextInt();
		System.out.println("Enter upper limit");
		int upperLimit = sc.nextInt();
		for (int i = lowerLimit; i <= upperLimit; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			} else {
				continue;
			}
		}
	}

	static void doWhile() {
		System.out.println("Printing cube");
		System.out.println("Enter lower limit");
		int lowerLimit = sc.nextInt();
		System.out.println("Enter upper limit");
		int upperLimit = sc.nextInt();
		int i = lowerLimit;
		do {
			System.out.println("Cube of " + i + " is " + (int) Math.pow(i++, 3));
		} while (i <= upperLimit);
	}

	static void lotteryOdds() {
		int n = 0, k = 0, bottom = 1;
		System.out.println("Calculating Lottery Odds");
		System.out.println("how many numbers do you need to draw? -->");
		k = sc.nextInt();
		System.out.println(" What is the highest number you can draw?-->");
		n = sc.nextInt();

		double top = n;
		for (int i = 1; i < (k); i++) {
			top *= (n - i);
			bottom *= i + 1;
		}

		Double odds = (double) top / bottom;

		System.out.println("Your odds are 1 in " + odds + " . Good luck!");
	}
}
