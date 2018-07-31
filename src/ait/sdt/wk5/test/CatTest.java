/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Software Design & Testing
 * Lec8 S44 - JUnit
 */
package ait.sdt.wk5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ait.sdt.wk5.cat.Cat;

class CatTest {

	@Test
	public void testCatConstructred() {
		Cat cat = new Cat("Tom", 4, "Black"); // Create Cat object
		assertEquals("Tom", cat.getName()); // Check the values are equal
		assertEquals(4, cat.getAge());
		assertEquals("Black", cat.getColour());
	}

	@Test
	void testCatNameChanged() {
		Cat cat = new Cat("Tom", 4, "Black");
		cat.setName("Jerry");
		assertEquals("Jerry", cat.getName());
	}

	@Test
	void testCatAgeChanged() {
		Cat cat = new Cat("Tom", 4, "Black");
		cat.setAge(5);
		assertEquals(5, cat.getAge());
	}

	@Test
	void testCatColourChanged() {
		Cat cat = new Cat("Tom", 4, "Black");
		cat.setColour("White");
		assertEquals("White", cat.getColour());
	}

}
