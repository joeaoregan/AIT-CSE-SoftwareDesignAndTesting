/*
 * Joe O'Regan
 * A00258304
 */
package com.ait.wk3;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		// forHeaderTesting();
		// forHeaderTestingB();
		// forHeaderTestingC();
		// forHeaderTestingD();
		// forSmallestLargest();
		// forHistogram();
		// forAverage();
		// forSequence();
		// forSumEvenNumbers();
		twelveDaysOfChristmas();
	}

	static void forHeaderTesting() {
		Scanner sc = new Scanner(System.in);
		int input = 0, total = 0;

		for (int i = 0;; i++) {
			System.out.print("Enter a number (-1 to end) --> ");
			input = sc.nextInt();

			if (input != -1) {
				total += input;
			} else if (input == -1) {
				System.out.println("Sum is " + total);
				break;
			}
		}

		sc.close();
	}

	static void forHeaderTestingB() {
		final int NUM_INPUTS = 3;

		Scanner sc = new Scanner(System.in);
		int j = 1, input = 0, total = 0;

		for (; j <= NUM_INPUTS; j++) {
			System.out.print("Enter a number --> ");
			input = sc.nextInt();
			total += input;
		}

		System.out.println("Sum is " + total);

		sc.close();
	}

	static void forHeaderTestingC() {
		final int NUM_INPUTS = 3;

		Scanner sc = new Scanner(System.in);
		int input = 0, total = 0;

		for (int k = 1; k <= NUM_INPUTS;) {
			k++;
			System.out.print("Enter a number --> ");
			input = sc.nextInt();
			total += input;
		}

		System.out.println("Sum is " + total);

		sc.close();
	}

	static void forHeaderTestingD() {
		Scanner sc = new Scanner(System.in);
		int input = 0, total = 0;

		for (;;) {
			System.out.print("Enter a number (-1 to end) --> ");
			input = sc.nextInt();

			if (input != -1) {
				total += input;
			} else if (input == -1) {
				System.out.println("Sum is " + total);
				break;
			}
		}

		sc.close();
	}

	static void forSmallestLargest() {
		Scanner sc = new Scanner(System.in);
		int n = 0, input = 0, smallest = 0, largest = 0;

		System.out.print("Enter n --> ");
		n = sc.nextInt();

		if (n <= 0) {
			System.out.println("n was invalid " + n);
		} else {
			for (int i = 0; i < n; i++) {
				System.out.print("Enter a number --> ");
				input = sc.nextInt();

				if (i == 0) {
					smallest = largest = input;
				} else {
					if (input < smallest) {
						smallest = input;
					} else if (input > largest) {
						largest = input;
					}
				}
			}

			System.out.println("The smallest number entered is " + smallest);
			System.out.println("The largest number entered is " + largest);
		}

		sc.close();
	}

	static void forHistogram() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows --> ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns --> ");
		int columns = sc.nextInt();
		System.out.print("Enter character to use --> ");
		char character = sc.next().charAt(0);

		for (int j = 0; j < rows; j++) {
			for (int i = 0; i < columns; i++) {
				System.out.print(character);
			}
			System.out.println();
		}

		sc.close();
	}

	static void forAverage() {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many values --> ");
		int n = sc.nextInt();
		double total = 0.0;

		for (int i = 0; i < n; i++) {
			System.out.print("Enter a value --> ");
			double value = sc.nextDouble();
			total += value;
		}

		System.out.println("The average is " + (total / n));

		sc.close();
	}

	static void forSequence() {
		final int NUM_TIMES = 10;
		for (int i = 1; i <= NUM_TIMES; i++) {
			System.out.print(i * i);
			if (i < NUM_TIMES) {
				System.out.print(", ");
			}
		}
	}

	static void forSumEvenNumbers() {
		Scanner sc = new Scanner(System.in);

		int total = 0;

		System.out.print("From --> ");
		int from = sc.nextInt();
		System.out.print("To --> ");
		int to = sc.nextInt();

		if (from % 2 == 0 && to % 2 == 0) {
			for (int i = from; i < to; i++) {
				if (i > from && i % 2 == 0) {
					total += i;
				}
			}
		} else {
			System.out.println("Odd input: " + from + "; " + to);
		}
		System.out.println("The total is " + total);

		sc.close();
	}

	static void twelveDaysOfChristmas() {
		String day = "";

		for (int i = 1; i <= 12; i++) {
			switch (i) {
			case 1:
				day = "first";
				break;
			case 2:
				day = "second";
				break;
			case 3:
				day = "third";
				break;
			case 4:
				day = "fourth";
				break;
			case 5:
				day = "fifth";
				break;
			case 6:
				day = "sixth";
				break;
			case 7:
				day = "seventh";
				break;
			case 8:
				day = "eight";
				break;
			case 9:
				day = "ninth";
				break;
			case 10:
				day = "tenth";
				break;
			case 11:
				day = "eleventh";
				break;
			case 12:
				day = "twelfth";
				break;
			}
			System.out.println("On the " + day + " day of Christmas,\nMy true love sent to me:");

			switch (i) {
			case 12:
				System.out.println("        Twelve drummers drumming,");
			case 11:
				System.out.println("        Eleven pipers piping,");
			case 10:
				System.out.println("        Ten lords a-leaping");
			case 9:
				System.out.println("        Nine ladies dancing,");
			case 8:
				System.out.println("        Eight maids a-milking,");
			case 7:
				System.out.println("        Seven swans a-swimming,");
			case 6:
				System.out.println("        Six geese a-laying,");
			case 5:
				System.out.println("        Five golden rings,");
			case 4:
				System.out.println("        Four calling birds,");
			case 3:
				System.out.println("        Three French hens,");
			case 2:
				System.out.println("        Two turtle doves, and");
			case 1:
				System.out.println("        A partridge in a pear tree.\n");
				break;
			}
		}
	}
}
