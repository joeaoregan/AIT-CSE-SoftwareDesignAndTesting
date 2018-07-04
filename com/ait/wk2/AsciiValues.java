package com.ait.wk2;
// Joe O'Regan
// 03/07/2018

import java.util.Scanner;

public class AsciiValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input = 'a';
		
		Scanner sc = new Scanner(System.in);

		while (input != 'x') {
			System.out.print("Enter char : ");
			input = sc.next().charAt(0);
			System.out.println("Ascii value of " + input + " is " + (int) input);
		}
		
		sc.close();
	}

}
