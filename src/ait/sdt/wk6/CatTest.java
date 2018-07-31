/*
 * Joe O'Regan
 * A00258304
 * 31/07/2018
 * Software Design and Testing
 */
package ait.sdt.wk6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatTest {
	// Setup method runs before each test
	Cat cat; // Needs to be visible to all methods
	@BeforeEach
	public void setup() {
		cat = new Cat("James",3,"Black");
		System.out.println("In before");
	}
	
	@Test
	void testCatConstructor() {
		//Cat cat = new Cat("James",3,"Black");
		assertEquals("James",cat.getName());
		assertEquals(3,cat.getAge());
		assertEquals("Black",cat.getColour());
	}
	
	@Test
	void testChangeCatColour() {
		//Cat cat = new Cat("James",3,"Black");
		cat.setColour("Green");
		assertEquals("Green",cat.getColour());
	}

}
