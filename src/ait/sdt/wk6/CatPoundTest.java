/*
 * Joe O'Regan
 * A00258304
 * 31/07/2018
 * Java Testing - 3. Unit Testing
 */
package ait.sdt.wk6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatPoundTest {
	private CatPound myCatPound;

	@BeforeEach
	public void setup() {
		myCatPound = new CatPound();
	}

	@Test
	void testNoCatsInPound() {
		assertEquals(0, myCatPound.getNumberOfCats());
	}

	@Test
	void testOneCatInPound() {
		Cat cat = new Cat("Tom");
		myCatPound.addCat(cat);
		assertEquals(1, myCatPound.getNumberOfCats());
	}

	@Test
	void testTwoCatsInPound() {
		Cat cat = new Cat("Tom");
		myCatPound.addCat(cat);
		assertEquals(1, myCatPound.getNumberOfCats());
		myCatPound.addCat(cat);
		assertEquals(2, myCatPound.getNumberOfCats());
	}

	@Test
	void testAskCatInPound() {
		Cat cat1 = new Cat("Tom");
		Cat cat2 = new Cat("Lucky");
		myCatPound.addCat(cat1);
		assertEquals(true, myCatPound.findCat(cat1));
		assertEquals(false, myCatPound.findCat(cat2));
	}

	@Test
	void testRemoveCatFromPound() {
		Cat cat = new Cat("Tom");
		myCatPound.addCat(cat);
		assertEquals(true, myCatPound.findCat(cat));
		myCatPound.removeCat(cat);
		assertEquals(false, myCatPound.findCat(cat));
	}

	@Test
	void testSearchCatByName() {
		Cat cat = new Cat("Tom");
		myCatPound.addCat(cat);
		assertEquals(true, myCatPound.searchCatName("Tom"));
		assertEquals(false, myCatPound.searchCatName("Jerry"));
	}

	@Test
	void testSearchCatsGreaterThanAge() {
		Cat cat1 = new Cat("Tom", 1, "Black");
		Cat cat2 = new Cat("Jerry", 3, "White");
		Cat cat3 = new Cat("Paws", 5, "Ginger");
		Cat cat4 = new Cat("Lucky", 7, "Brown");
		assertEquals(0, myCatPound.getNumberOlderThan());
		myCatPound.addCat(cat1);
		myCatPound.addCat(cat2);
		assertEquals(1, myCatPound.getNumberOlderThan());
		myCatPound.addCat(cat3);
		myCatPound.addCat(cat4);
		assertEquals(3, myCatPound.getNumberOlderThan());

	}
}
