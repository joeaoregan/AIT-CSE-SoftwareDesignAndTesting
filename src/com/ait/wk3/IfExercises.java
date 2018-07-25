/* 
 * Joe O'Regan
 * A00258304
 * 09/07/2018
 */

package com.ait.wk3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfExercises {

	public static void main(String[] args) {
		// ifMonth();
		// ifLargerOfTwoNumbers();
		// ifGrade();
		temperature();
		// ifLargest();
		// ternaryOperator();
	}

	static void ifMonth() {
		Scanner sc = new Scanner(System.in);

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

		int month = 0;

		try {
			System.out.print("Enter month (1-12): ");
			month = sc.nextInt();

			if (month < 1 || month > 12) {
				System.out.println("Entry is out of range: " + month);
			} else if (month == JAN) {
				System.out.println("January");
			} else if (month == FEB) {
				System.out.println("February");
			} else if (month == MAR) {
				System.out.println("March");
			} else if (month == APR) {
				System.out.println("April");
			} else if (month == MAY) {
				System.out.println("May");
			} else if (month == JUN) {
				System.out.println("June");
			} else if (month == JUL) {
				System.out.println("July");
			} else if (month == AUG) {
				System.out.println("August");
			} else if (month == SEP) {
				System.out.println("September");
			} else if (month == OCT) {
				System.out.println("October");
			} else if (month == NOV) {
				System.out.println("November");
			} else if (month == DEC) {
				System.out.println("December");
			}
		} catch (InputMismatchException e) {
			System.out.println("Exception!");
			e.printStackTrace();
		}

		sc.close();
	}

	static void ifLargerOfTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;

		try {
			System.out.print("Enter first number : ");
			num1 = sc.nextInt();
			System.out.print("Enter second number : ");
			num2 = sc.nextInt();

			if (num1 < 0 || num2 < 0) {
				System.out.println("Negative values are not allowed: " + num1 + " " + num2);
			} else if (num1 > 0 && num2 > 0) {
				if (num1 > num2) {
					System.out.println(num1 + " is > " + num2);
				} else if (num2 > num1) {
					System.out.println(num2 + " is > " + num1);
				} else if (num1 == num2) {
					System.out.println(num1 + " is equal to " + num2);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}

		sc.close();
	}

	static void ifGrade() {
		Scanner sc = new Scanner(System.in);
		int mark = 0;

		try {
			System.out.print("Enter mark : ");
			mark = sc.nextInt();

			if (mark < 0 || mark > 100) {
				System.out.println("Error in input: " + mark + ". Valid values are 0..100");
			} else if (mark >= 70 && mark <= 100) {
				System.out.println("A");
			} else if (mark >= 60 && mark <= 69) {
				System.out.println("B");
			} else if (mark >= 50 && mark <= 59) {
				System.out.println("C");
			} else if (mark >= 40 && mark <= 49) {
				System.out.println("D");
			} else {
				System.out.println("Fail");
			}
		} catch (InputMismatchException e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}

		sc.close();
	}

	static void temperature() {
		Scanner sc = new Scanner(System.in);

		int temp = 0;

		try {
			System.out.print("Enter temperature : ");
			temp = sc.nextInt();

			final int EX_LOW = -10;
			final int VERY_COLD = 2;
			final int COLD = 9;
			final int MILD = 14;
			final int WARM = 20;
			final int VERY_WARM = 27;
			final int HOT = 31;

			if (temp >= EX_LOW && temp <= VERY_COLD) {
				System.out.print("Very Cold: ");
			} else if (temp > VERY_COLD && temp <= COLD) {
				System.out.print("Cold: ");
			} else if (temp > COLD && temp <= MILD) {
				System.out.println("Mild: ");
			} else if (temp > MILD && temp <= WARM) {
				System.out.print("Warm: ");
			} else if (temp > WARM && temp <= VERY_WARM) {
				System.out.print("Very Warm: ");
			} else if (temp > VERY_WARM && temp <= HOT) {
				System.out.print("Hot: ");
			} else if (temp < EX_LOW || temp > HOT) {
				System.out.print("Extreme temperature: ");
			}

			System.out.println(temp);

		} catch (InputMismatchException e) {
			System.out.println("Exception caught...");
			e.printStackTrace();
		}

		sc.close();
	}

	static void ifLargest() {
		Scanner sc = new Scanner(System.in);

		int num1 = 0, num2 = 0, num3 = 0;

		try {
			System.out.print("Enter first number : ");
			num1 = sc.nextInt();
			System.out.print("Enter second number : ");
			num2 = sc.nextInt();
			System.out.print("Enter third number : ");
			num3 = sc.nextInt();

			if (num1 > num2 && num1 > num3) {
				System.out.println("Largest Number is " + num1);
			} else if (num2 > num1 && num2 > num3) {
				System.out.println("Largest Number is " + num2);
			} else if (num3 > num1 && num3 > num2) {
				System.out.println("Largest Number is " + num3);
			}
		} catch (InputMismatchException e) {
			System.out.println("Exception caught...");
			e.printStackTrace();
		}

		sc.close();
	}

	static void ternaryOperator() {
		Scanner sc = new Scanner(System.in);

		Boolean isHappy = true;
		String mood = "";

		int x = 0, y = 0;

		mood = (isHappy) ? "I am Happy" : "I am Sad";
		System.out.println(mood);

		System.out.print("Enter x : ");
		x = sc.nextInt();
		System.out.print("Enter y : ");
		y = sc.nextInt();

		int minVal = 0;
		minVal = (x < y) ? x : y;
		System.out.println("minVal == " + minVal);

		sc.close();
	}
}
