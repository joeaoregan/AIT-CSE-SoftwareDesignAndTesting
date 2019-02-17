/*
 * A00258304
 */
package com.ait.vending;

public class Product {
	private String productCode;
	private String productDescription;
	private int quantity;
	private Double unitPrice;

	public Product(String productCode, String productDescription, Double unitPrice, int quantity) {
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
