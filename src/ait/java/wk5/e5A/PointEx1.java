/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 */
package ait.java.wk5.e5A;
import java.awt.*;

public class PointEx1 {
	public static void main (String args[]) {
		Point a, b, c;
		a = new Point();
		b = new Point (12, 45);
		c = new Point (b);
		
		System.out.print(c);
	}
}
