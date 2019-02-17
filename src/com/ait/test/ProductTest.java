/*
 * A00258304
 */
package com.ait.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ait.vending.Product;
import com.ait.vending.VendingMachine;

class ProductTest {
	Product product;
	VendingMachine vendingMachine;

	@BeforeEach
	void setup() {
		product = new Product("D001", "Mars Bar", 1.49, 5);
		vendingMachine = new VendingMachine();
	}

	@Test
	void testProductConstructor() {
		assertEquals("D001", product.getProductCode());
		assertEquals("Mars Bar", product.getProductDescription());
		assertEquals(1.49, product.getUnitPrice(), 0.0);
		assertEquals(5, product.getQuantity());
	}

	@Test
	void testChangeUnitPrice() {
		assertEquals(1.49, product.getUnitPrice(), 0.0);
		product.setUnitPrice(1.75);
		assertEquals(1.75, product.getUnitPrice(), 0.0);
	}

	@Test
	void testChangeProductDescription() {
		assertEquals("Mars Bar", product.getProductDescription());
		product.setProductDescription("Snickers");
		assertEquals("Snickers", product.getProductDescription());
	}

	@Test
	void testChangeQuantity() {
		assertEquals(5, product.getQuantity());
		product.setQuantity(10);
		assertEquals(10, product.getQuantity());
	}	
}
