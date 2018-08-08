/*
 * A00258304
 */
package com.ait.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ait.vending.Product;
import com.ait.vending.VendingMachine;

class VendingMachineTest {
	Product product;
	VendingMachine vendingMachine;

	@BeforeEach
	void setup() {
		product = new Product("D001", "Mars Bar", 1.49, 5);
		vendingMachine = new VendingMachine();
	}

	@Test
	void testAddOneProductOK() {
		assertEquals("OK", vendingMachine.addProduct(product));
	}

	@Test
	void testAddTwoProductsOK() {
		assertEquals("OK", vendingMachine.addProduct(product));
		assertEquals("OK", vendingMachine.addProduct(new Product("D002", "Snickers", 1.25, 10)));
	}

	@Test
	void testAddProductAlreadyExists() {
		assertEquals("OK", vendingMachine.addProduct(product));
		assertEquals("ALREADY EXISTS", vendingMachine.addProduct(product));
	}

	@Test
	void testFindProductOK() {
		assertEquals("OK", vendingMachine.addProduct(product));
		Product productToFind = vendingMachine.findProduct("D001");
		assertEquals("D001", productToFind.getProductCode());
	}

	@Test
	void testFindProductNOTFOUND() {
		vendingMachine.addProduct(product);
		Product product1 = new Product("D002", "Dairy Milk", 1.20, 20);
		assertEquals(null, vendingMachine.findProduct("D002"));
	}

	@Test
	void testRemoveProductOK() {
		vendingMachine.addProduct(product);
		assertEquals("OK", vendingMachine.removeProduct("D001"));
	}

	@Test
	void testRemoveProductNOTFOUND() {
		vendingMachine.addProduct(product);
		assertEquals("NOT FOUND", vendingMachine.removeProduct("D002"));
	}

	@Test
	void testBuyProductOK() {
		vendingMachine.addProduct(product);
		vendingMachine.setAmountInserted(2.0);
		assertEquals("OK", vendingMachine.buyProduct("D001"));
	}

	@Test
	void testBuyProductNOTFOUND() {
		vendingMachine.addProduct(product);
		assertEquals("NOT FOUND", vendingMachine.buyProduct("D002"));
	}

	@Test
	void testBuyProductQuantityUpdated() {
		vendingMachine.addProduct(product);
		vendingMachine.setAmountInserted(2.0);
		assertEquals("OK", vendingMachine.buyProduct("D001"));
		assertEquals(4, product.getQuantity());
	}

	@Test
	void testBuyProductInsertMoney() {
		vendingMachine.addProduct(product);
		assertEquals("INSERT MONEY", vendingMachine.buyProduct("D001"));
		assertEquals(5, product.getQuantity());
	}

	@Test
	void testBuyProductOutOfStock() {
		vendingMachine.addProduct(product);
		product.setQuantity(0);
		vendingMachine.setAmountInserted(2.0);
		assertEquals("OUT OF STOCK", vendingMachine.buyProduct("D001"));
	}

	@Test
	void testBuyProductOutOfService() {
		vendingMachine.setOutOfServiceAlarm(true);
		assertEquals("OUT OF SERVICE", vendingMachine.buyProduct("D001"));
	}
}
