/* 
 * Joe O'Regan
 * A00258304
 * 03/07/2018
 */
package ait.java.wk2;

public class AlgebraicExpression {

	public static void main(String[] args) {
		int x = 2, a = 3;

		System.out.println("Evaluating \"y = ax3 + 7\" where x == 2 and a == 3");

		int y = a * x * x * x + 7;
		System.out.println("y = a * x * x * x + 7 sets y to     : " + y);
		y = a * x * x * (x + 7);
		System.out.println("y = a * x * x * (x + 7) sets y to   : " + y);
		y = (a * x) * x * (x + 7);
		System.out.println("y = (a * x) * x * (x + 7) sets y to : " + y);
		y = (a * x) * x * x + 7;
		System.out.println("y = (a * x) * x * x + 7 sets y to   : " + y);
		y = a * (x * x * x) + 7;
		System.out.println("y = a * (x * x * x) + 7 sets y to   : " + y);
		y = a * x * (x * x + 7);
		System.out.println("y = a * x * (x * x + 7) sets y to   : " + y);
		y = a * (int) Math.pow((double) x, 3.0) + 7;
		System.out.println("y = a * x^3 +7 using Math.pow) sets y to     : " + y);
	}
}
