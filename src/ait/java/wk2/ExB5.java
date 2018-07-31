/*
 * Joe O'Regan
 * A00258304
 */

package ait.java.wk2;

public class ExB5 {

	public static void main(String[] args) {
		int x = 0, w = 0, y = 0, z = 0;
		x = 4;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);
		w = 20;
		x = 10;
		y = -5;
		z = 0;

		System.out.println(w == x && y != z);
		System.out.println(w == x || y != z);
		System.out.println(!(w == (x + z)));
	}

}
