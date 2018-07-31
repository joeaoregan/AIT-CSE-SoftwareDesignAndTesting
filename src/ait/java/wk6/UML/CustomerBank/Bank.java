/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 * Java: UML Exercises - 3 Customer Bank
 */
package ait.java.wk6.UML.CustomerBank;

public class Bank {

	public static void main(String[] args) {
		Customer customerOne = new Customer();
		customerOne.setAccountNo(123);
		customerOne.setBalance(1000.00);
		customerOne.setName("James");
		
		System.out.println(customerOne.toString());
		
		Customer customerTwo = new Customer(345,2000.00,"Kate");
		
		System.out.println(customerTwo.toString());
		
		customerTwo.setName("Katy");
		customerTwo.setBalance(2500.00);
		customerTwo.setAccountNo(348);

		System.out.println(customerTwo.toString());
		
		System.out.println(Customer.getCount());
	}

}
