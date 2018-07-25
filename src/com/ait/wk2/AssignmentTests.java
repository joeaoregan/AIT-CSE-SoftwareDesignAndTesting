/* 
 * Joe O'Regan
 * A00258304
 * 03/07/2018
 * 
 * Wk2 Ex A3
 */

package com.ait.wk2;

import java.util.Scanner;

public class AssignmentTests {

	public static void main(String[] args) {
		int x = 0;

		Scanner sc = new Scanner(System.in);

		// while (x ==0) {
		System.out.print("Enter integer (1..10) : ");
		x = sc.nextInt();

		if (x >= 1 && x <= 5) {
			System.out.println("The square of " + x + " is " + Math.pow(x, 2));
		} else if (x >= 6 && x <= 10) {
			System.out.println("The cube of " + x + " is " + Math.pow(x, 3));
		} else if (x <= 0 || x > 10) {
			System.out.println("Input value outside of range 1..10: " + x);
		}
		// }

		sc.close();
	}
}
