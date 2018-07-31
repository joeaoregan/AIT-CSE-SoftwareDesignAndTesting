/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Static Non-Static 2
 */
package com.ait.wk5.e5A;

public class CounterStatic {
	private static int count;

	public CounterStatic() {
		count++;
	}

	public int getCount() {
		return count;
	}

	public static int getCounter() {
		return count;
	}
}
