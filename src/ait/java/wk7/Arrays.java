/*
 * Joe O'Regan
 * A00258304
 * 07/08/2018
 * Java: Arrays
 */
package ait.java.wk7;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// exercise();
		// exercise2();
		// histogram();
		//dynamicHistorgram();
		//frequency();
		//multiDimArray();
		studentGrades();
	}

	public static void exercise() {
		int[] a = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int test : a) {
			System.out.println(test);
		}
	}

	public static void exercise2() {
		int[] a = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter a value --> ");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int x : a) {
			System.out.println(x);
		}

		sc.close();
	}

	public static void histogram() {
		int[] n = { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 };

		for (int x = 0; x < n.length; x++) {
			System.out.print(x + "\t");
			System.out.print(n[x] + "\t");
			for (int i = 0; i < n[x]; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void dynamicHistorgram() {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many elements in arrray? ");
		int elements = sc.nextInt();

		int[] n = new int[elements];

		for (int i = 0; i < n.length; i++) {
			System.out.print("Please enter a value --> ");
			n[i] = sc.nextInt();
		}

		for (int x = 0; x < n.length; x++) {
			System.out.print(x + "\t");
			System.out.print(n[x] + "\t");
			for (int i = 0; i < n[x]; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}
	
	public static void frequency() {
		int responses[] = {1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,8,2,7};
		int frequency[] = {0,0,0,0,0,0,0,0,0,0,0};
		
		for (int i = 1; i < 11; i++) {
			for (int j = 0; j < responses.length; j++) {
				if (responses[j] == i) {
					frequency[i]++;
				}
			}
		}
		
		System.out.println("Rating  Frequency");
		
		for (int i = 1; i < frequency.length; i++) {
			System.out.println(i + "\t" + frequency[i]);
		}		
	}
	
	public static void multiDimArray() {
		int[][] array = {{1,2,3}, {4,5,6}};
		
		System.out.println("Values of array are :");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
					System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void studentGrades() {
		int studentGrades[][] = {{77,68,86,73},
				{96,87,89,78},
				{70,90,86,81}};
		
		String[] students = {"first", "second", "third"};

		System.out.println("The array is");
		System.out.println("\t\t[0]\t[1]\t[2]\t[3]\n");
		for (int i = 0; i < 3; i++) {
			System.out.print("studentGrades["+i+"] ");
			for (int j = 0; j < 4; j++) {
				System.out.print(studentGrades[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\n");
		//int total = 0;
		int lowestGrade = 100;
		int highestGrade = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (studentGrades[i][j] < lowestGrade) {
					lowestGrade = studentGrades[i][j];
				}
				if (studentGrades[i][j] > highestGrade) {
					highestGrade = studentGrades[i][j];
				}
			}
		}
		System.out.println("The lowest grade is " + lowestGrade);
		System.out.println("The highest grade is " + highestGrade);
		
		for (int i = 0; i < 3; i++) {
			Double total = 0.0;
			for (int j = 0; j < 4; j++) {
				total += studentGrades[i][j];					
			}
			System.out.println("The average for the "+students[i]+" student is " + total / 4);
		}
	}
}
