// Joe O'Regan
// 03/07/2018
// Wk2 - Ex A5

package com.ait.wk2;

import java.util.Scanner;

public class Circle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		int radius = 0;
		
		System.out.print("Enter radius: ");
		radius = sc.nextInt();
		System.out.println("The diameter is "+radius*2);
		System.out.println("The circumference is "+(PI*2*radius));
		System.out.println("The area is "+PI*(Math.pow(radius, 2)));
	}

}
