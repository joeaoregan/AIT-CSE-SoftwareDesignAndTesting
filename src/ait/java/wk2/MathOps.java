/* 
 * Joe O'Regan
 * A00258304
 * 03/07/2018
 * 
 * Wk2 Ex B3
 */

package ait.java.wk2;

import java.util.Scanner;

public class MathOps {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num1: ");
		num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		num2 = sc.nextInt();

		System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
		System.out.println("The product of " + num1 + " and " + num2 + " is " + num1 * num2);
		System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
		if (num2 > 0) {
			System.out.println("The quotient of " + num1 + " and " + num2 + " is " + num1 / num2);
		} else {
			System.out.println("num2 is " + num2 + "; cannot divide by 0 : " + num2);
		}

		sc.close();
	}

}
