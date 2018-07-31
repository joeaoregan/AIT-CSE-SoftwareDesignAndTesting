/*
 * Joe O'Regan
 * A00258304
 * 31/07/2018
 * Java - Lecture 6 Arrays and ArrayLists
 */
package ait.java.wk6.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayExample {

	public static void main(String[] args) {
		String[] movieTitles = new String[3];
		movieTitles[0] = "Harry Potter";

		for (int i = 0; i < movieTitles.length; i++) {
			System.out.println(movieTitles[i]);
		}

		Cat[] catList = new Cat[3];
		catList[0] = new Cat("Tom");
		catList[1] = new Cat("Jerry");
		Cat cat = new Cat("Paws");
		catList[2] = cat;

		for (Cat theCat : catList) {
			System.out.println(theCat.getName());
		}

		int[] numbers = { 2, 4, 7, 5, 3, 1, 0 };
		for (int i : numbers) {
			System.out.print(i + ", ");
		}
		System.out.println();
		Arrays.sort(numbers);
		for (int i : numbers) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		// create an array list of type String
		ArrayList<String> codes = new ArrayList<String>();
		// add three strings
		codes.add("mbdk");
		codes.add("citr");
		codes.add(0, "warp");
		// print the array list
		for (int i = 0; i < codes.size(); i++) {
			String code = codes.get(i);
			System.out.println(code);
		}
	}

}
