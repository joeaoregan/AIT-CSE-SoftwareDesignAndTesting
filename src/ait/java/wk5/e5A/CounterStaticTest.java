/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Static Non-Static 2
 */

package ait.java.wk5.e5A;

public class CounterStaticTest {

	public static void main(String[] args) {
		CounterStatic counter1 = new CounterStatic();
		CounterStatic counter2 = new CounterStatic();
		CounterStatic counter3 = new CounterStatic();
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		System.out.println(counter3.getCount());

		System.out.println(CounterStatic.getCounter());
	}

}
