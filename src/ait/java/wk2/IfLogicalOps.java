/* 
 * Joe O'Regan
 * A00258304
 * 03/07/2018
 * 
 * Wk2 Ex B2
 */

package ait.java.wk2;

import java.util.Scanner;

public class IfLogicalOps {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num1: ");
		num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		num2 = sc.nextInt();

		if (num1 < 0 && num2 < 0) {
			System.out.println("Both numbers are negative");
		} else if (num1 > 0 && num2 > 0) {
			System.out.println("Both numbers are positive");
		} else if (num1 == 0 || num2 == 0) {
			System.out.println("At least one of the numbers is 0");
		} else if (num1 < 0 || num2 < 0) {
			System.out.println("At least one of the numbers is negative");
		}

		sc.close();
	}
}
