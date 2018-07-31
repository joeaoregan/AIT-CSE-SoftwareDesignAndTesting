/*
 *  Joe O'Regan
 *  A00258304
 *  10/07/2018
 */

package ait.java.wk3;

public class Loops {

	public static void main(String[] args) {
		// breakStatement();
		// labeledBreakStatement();
		continueStatement();
	}

	static void breakStatement() {
		for (int i = 1; i < 4; i++) {
			System.out.println("Outer " + i);
			while (true) {
				int number = (int) (Math.random() * 10);

				System.out.println("   Inner " + number);

				if (number > 7) {
					break;
				}
			}
		}
	}

	static void labeledBreakStatement() {
		outerLoop: for (int i = 1; i < 4; i++) {
			System.out.println("Outer " + i);

			while (true) {
				int number = (int) (Math.random() * 10);

				System.out.println("   Inner " + number);

				if (number > 7) {
					break outerLoop;
				}
			}
		}
	}

	static void continueStatement() {
		for (int j = 1; j < 10; j++) {
			int number = (int) (Math.random() * 10);

			System.out.println(number);

			if (number <= 7) {
				continue;
			}

			System.out.println("This number is greater than 7");
		}
	}
}
