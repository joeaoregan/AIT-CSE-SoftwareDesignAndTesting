package com.ait.catpound;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatTest {
	private Cat cat;
	
	@BeforeEach
	public void setUp() {
		cat=new Cat("James",3,"Black");
	}
	@Test
	void testCatConstructor() {
		assertEquals("James",cat.getName());
		assertEquals(3,cat.getAge());
		assertEquals("Black",cat.getColor());
	}
	@Test
	void testChangeCatName() {
		cat.setName("Jerry");
		assertEquals("Jerry",cat.getName());
	}
	@Test
	void testChangeCatAge() {
		cat.setAge(5);
		assertEquals(5,cat.getAge());
	}
	
	@Test
	void testChangeCatColor() {
		cat.setColor("Green");
		assertEquals("Green",cat.getColor());
	}

}
