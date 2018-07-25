/* 
 * Joe O'Regan
 * A00258304
 * 03/07/2018
 * 
 * Wk2 Ex B4
 */

package com.ait.wk2;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		int x, y;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter x: ");
		x = sc.nextInt();
		System.out.print("Enter y: ");
		y = sc.nextInt();

		if (x % y == 0) {
			System.out.println(x + " is a multiple of " + y);
		} else {
			System.out.println(x + " is not a multiple of " + y);
		}
		
		sc.close();
	}

}
