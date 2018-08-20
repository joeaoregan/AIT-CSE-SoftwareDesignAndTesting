/*
 * Joe O'Regan
 * A00258304
 * 20/08/2018
 */

package ait.java.wk9;

public class ArrayExercise2 {

	public static void main(String[] args) {
		statistics();
	}

	public static void statistics() {
		int arr1[] = { 9, 3, 44, 17, 15 };

		System.out.println("The average is " + average(arr1));
		System.out.println("The Median value is " + median(arr1));
	}

	public static double average(int arr[]) {
		double total = 0.0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return (double) (total / arr.length);
	}

	public static double median(int arr[]) {
		int median = arr.length / 2;

		// int temp[] = new int[arr.length];
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		/*
		 * if (arr.length % 2 == 0) { return (arr[median] + arr[median + 1]) / 2; }
		 */
		return arr[median];
	}
}
