package com.ait.catpound;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatPoundTest {
	private CatPound myCatPound;
	
	@BeforeEach
	public void setUp() {
		myCatPound=new CatPound();
	}
	
	@Test
	void testNoCatsInPound() {
		assertEquals(0,myCatPound.getNumberOfCats());
	}
	
	@Test
	void testOneCatInPound() {
		Cat cat=new Cat("Jerry",5,"Black");
		myCatPound.addCat(cat);
		assertEquals(1,myCatPound.getNumberOfCats());
	}

}
