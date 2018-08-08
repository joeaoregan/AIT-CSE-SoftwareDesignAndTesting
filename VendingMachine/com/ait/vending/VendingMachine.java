/*
 * A00258304
 */
package com.ait.vending;

import java.util.ArrayList;

public class VendingMachine {
	ArrayList<Product> products;
	private Double amountInserted;
	private Boolean outOfServiceAlarm;

	public VendingMachine() {
		products = new ArrayList<Product>();
		amountInserted = 0.0;
		outOfServiceAlarm = false;
	}

	public String addProduct(Product product) {
		for (Product searchProduct : products) {
			if (searchProduct.getProductCode().equalsIgnoreCase(product.getProductCode())) {
				return "ALREADY EXISTS";
			}
		}

		products.add(product);
		return "OK";
	}

	public String removeProduct(String productCode) {
		for (Product product : products) {
			if (product.getProductCode().equalsIgnoreCase(productCode)) {
				products.remove(product);
				return "OK";
			}
		}
		return "NOT FOUND";
	}

	public Product findProduct(String productCode) {
		for (Product product : products) {
			if (product.getProductCode().equalsIgnoreCase(productCode)) {
				return product;
			}
		}

		return null;
	}

	// public void setMoneyInserted(Double amountInserted) {
	public void setAmountInserted(Double amountInserted) {
		this.amountInserted = amountInserted;
	}

	public void setOutOfServiceAlarm(Boolean outOfServiceAlarm) {
		this.outOfServiceAlarm = outOfServiceAlarm;
	}

	public String buyProduct(String productCode) {
		if (outOfServiceAlarm) {
			return "OUT OF SERVICE";
		}

		for (Product product : products) {
			if (product.getProductCode().equalsIgnoreCase(productCode)) {
				if (product.getUnitPrice() > amountInserted) {
					return "INSERT MONEY";
				}
				if (product.getQuantity() == 0) {
					return "OUT OF STOCK";
				} else {
					product.setQuantity(product.getQuantity() - 1);
					return "OK";
				}
			}
		}

		return "NOT FOUND";
	}
}
