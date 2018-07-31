/* 
 * Joe O'Regan
 * A00258304
 * 10/07/2018 
 */

package ait.java.wk3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		// thirdOrderPolynomial();
		// whileAverage();
		// whileGrades(); // XXX
		// whileHistogram();
		// whileLargestSmallest();
		// whileSales();
		// whileSquares();
		whileAverageSentinel();
	}

	static void thirdOrderPolynomial() {
		// fx = ax3 + bx2 + cx + d
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter coefficient a : ");
		double a = sc.nextDouble();
		System.out.print("Enter coefficient b : ");
		double b = sc.nextDouble();
		System.out.print("Enter coefficient c : ");
		double c = sc.nextDouble();
		System.out.print("Enter coefficient d : ");
		double d = sc.nextDouble();

		char exit = 'y';

		while (exit != 'n') {
			System.out.print("Enter the value for x: ");
			double x = sc.nextDouble();

			// double polynomial = (a * (x * x * x)) + (b * (x * x)) + (c * x) + d;
			double polynomial = (a * Math.pow(x, 3)) + (b * Math.pow(x, 2)) + (c * x) + d;

			System.out.println("The value of the polynomial at 1.0 is " + polynomial);

			System.out.print("Do you wish to continue (y/n); --> ");
			exit = sc.next().charAt(0);
		}
		sc.close();
	}

	static void whileAverage() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		double input = 0, total = 0;

		System.out.print("How many numbers in the sequence --> ");
		int nums = sc.nextInt();

		while (i < nums) {
			System.out.print("Please enter a number --> ");
			input = sc.nextInt();
			total += input;
			i++;
		}

		System.out.println("Average is " + total / nums);

		sc.close();
	}

	static void whileGrades() {
		Scanner sc = new Scanner(System.in);

		int aTotal = 0, bTotal = 0, cTotal = 0, dTotal = 0, eTotal = 0, fTotal = 0;

		// char input = 'n';
		String input = "";

		// while (Character.toLowerCase(input) != 'x') {
		while (!input.equalsIgnoreCase("x")) {
			System.out.print("Enter the grade a-f or A-F (x/X to exit) --> ");
			// input = sc.next().charAt(0);
			input = sc.next();

			if (input.length() == 1) {
				char letter = input.charAt(0);

				switch (Character.toLowerCase(letter)) {
				case 'a':
					aTotal++;
					break;
				case 'b':
					bTotal++;
					break;
				case 'c':
					cTotal++;
					break;
				case 'd':
					dTotal++;
					break;
				case 'e':
					eTotal++;
					break;
				case 'f':
					fTotal++;
					break;
				// default:
				// System.out.println("Letter entered was not in range !" + input);
				// break;
				}
			} else {
				System.out.println("Letter entered was not in range !" + input);
			}
		}

		System.out.println("Number of A's is        " + aTotal);
		System.out.println("Number of B's is        " + bTotal);
		System.out.println("Number of C's is        " + cTotal);
		System.out.println("Number of D's is        " + dTotal);
		System.out.println("Number of E's is        " + eTotal);
		System.out.println("Number of F's is        " + fTotal);

		sc.close();
	}

	static void whileHistogram() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows --> ");
		int rows = sc.nextInt();
		System.out.print("Enter number of cols --> ");
		int cols = sc.nextInt();

		int i = 0;

		while (i < rows) {
			int j = 0;
			while (j < cols) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

		sc.close();
	}

	static void whileLargestSmallest() {
		Scanner sc = new Scanner(System.in);

		int i = 0, input = 0, largest = 0, smallest = 0;

		System.out.print("Enter n --> ");
		int n = sc.nextInt();

		if (n > 0) {
			// while(i<n) {
			while (i++ < n) {
				System.out.print("Enter a number --> ");
				input = sc.nextInt();
				// if (i==0) {
				// initialise smallest and largest values to first number entered
				if (i == 1) {
					largest = smallest = input;
				}

				if (input > largest) {
					largest = input;
				} else if (input < smallest) {
					smallest = input;
				}

				// i++;
			}

			System.out.println("Largest is " + largest);
			System.out.println("Smallest is " + smallest);
		} else {
			System.out.println("n was invalid: " + n);
		}

		sc.close();
	}

	static void whileSales() {
		Scanner sc = new Scanner(System.in);
		double sales = 0.0;

		while (sales != -1) {
			System.out.print("Enter sales (-1 to end) --> ");
			sales = sc.nextDouble();

			if (sales != -1) {
				System.out.println("Salary is " + (3000.0 + (sales * .09)) + " Euro\n");
			}
		}

		sc.close();
	}

	static void whileSquares() {
		int i = 1, total = 0;
		while (i < 6) {
			total += Math.pow(i, 2);
			System.out.println((int) Math.pow(i++, 2));
		}
		System.out.println("Total is " + total);
	}

	static void whileAverageSentinel() {
		Scanner sc = new Scanner(System.in);
		double input = 0.0, total = 0.0, average = 0.0;
		int num = 0;

		try {
			while (input != -1) {
				System.out.print("Please enter a number (-1 to exit) --> ");
				input = sc.nextDouble();
				if (input != -1) {
					total += input;
					num++;
				}
			}

			if (total > 0) {
				System.out.println("Average is " + total / num);
			}
			// else {
			// System.out.println("No numbers entered...");
			// }
		} catch (InputMismatchException e) {
			System.out.println("No numbers entered...");
		}
	}
}
