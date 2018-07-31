/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Lec5 S86
 */
package ait.java.wk5;

public class S86ClassDiagram {
	private String code;
	private String description;
	private Double price;
	
	public void setCode(String s) {
		this.code = s;
	}
	public String getCode() {
		return code;
	}
	public void setDescription(String s) {
		description = s;
	}
	public String getDescription() {
		return description;
	}
	public void setPrice(Double d) {
		price = d;
	}
	public Double getPrice() {
		return price;
	}
	public String getFormattedPrice() {
		return Double.toString(price);
	}
	
}
