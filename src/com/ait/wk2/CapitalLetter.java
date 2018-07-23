/* 
 * Joe O'Regan
 * A00258304
 * 03/07/2018
 * 
 * Wk2 Ex A4
 */

package com.ait.wk2;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		char letter;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter a letter (a-zA-Z): ");
			letter = sc.next().charAt(0);
			
			if(!Character.isLetter(letter)) {
				System.out.println("Error in input: "+letter);
			} else if (Character.isUpperCase(letter)) {
				System.out.println("Uppercase : "+letter);
				System.out.println("The ASCII value of "+letter+" is "+(int)letter);
			} else if (Character.isLowerCase(letter)) {
				System.out.println("Lowercase : "+letter);
				System.out.println("The ASCII value of "+letter+" is "+(int)letter);
			}
		}
		
		//sc.close();
	}
}
