/*
 * Joe O'Regan
 * A00258304
 * 25/07/2018
 * 
 * Software Development & Testing 
 * JUnit Lab 2
 */
package com.ait.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ait.cat.DiscountCalculator;

class DiscountCalculatorTest {

	@Test
	void testGoldOver250() {
		DiscountCalculator discount = new DiscountCalculator();
		assertEquals(200, discount.discountCalculator('g', 250.0), 0.1);
	}

	@Test
	void testGold100and250() {
		DiscountCalculator discount = new DiscountCalculator();
		assertEquals(90, discount.discountCalculator('g', 100), 0.1);
	}

	@Test
	void testGoldUnder100() {
		DiscountCalculator discount = new DiscountCalculator();
		assertEquals(47.5, discount.discountCalculator('g', 50), 0.1);
	}

	@Test
	void testSilverOver200() {
		DiscountCalculator discount = new DiscountCalculator();
		assertEquals(180, discount.discountCalculator('s', 200), 0.1);
	}

	@Test
	void testSilver100and200() {
		DiscountCalculator discount = new DiscountCalculator();
		assertEquals(142.5, discount.discountCalculator('s', 150), 0.1);
	}

	@Test
	void testSilverUnder100() {
		DiscountCalculator discount = new DiscountCalculator();
		assertEquals(80, discount.discountCalculator('s', 80), 0.1);
	}

	@Test
	void testBronzeOver300() {
		DiscountCalculator discount = new DiscountCalculator();
		assertEquals(380, discount.discountCalculator('b', 400), 0.1);
	}

	@Test
	void testBronzeUnder300() {
		DiscountCalculator discount = new DiscountCalculator();
		assertEquals(250, discount.discountCalculator('b', 250), 0.1);
	}
}
