/*
 * Joe O'Regan
 * A00258304
 * 23/07/2018
 * 
 * Lec5
 */
package ait.java.wk5;

public class StringTester {

	public static void main(String[] args) {
		String str1, str2; // str1 is a variable that may refer to an object.
		// The object does not exist unit the "new" is executed.
		int len; // len is a primitive variable of type int

		str1 = new String("Mary Giblin"); // create an object of type String
		str2 = new String("Mary Giblin");
		len = str1.length(); // invoke the object's method length()
		System.out.println("The string is " + len + " characters long");

		if (str1 == str2) {
			System.out.println("The strings are equal");
		} else {
			System.out.println("The strings are not equal");
		}

		if (str1.equals(str2)) {
			System.out.println("The values are equal");
		} else {
			System.out.println("The values are not equal");
		}
	}

}
