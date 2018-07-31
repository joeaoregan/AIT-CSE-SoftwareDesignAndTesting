/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 * Java: UML Exercises - 3 Customer Bank
 */
package ait.java.wk6.UML.CustomerBank;

public class Customer {
	private int accountNo;
	private double balance;
	private String name;
	private static int count;

	public Customer() {
		count++;
	}

	public Customer(int accountNo, double balance, String name) {
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
		count++;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return ("Customer [accountNo=" + accountNo + 
				", name=" + name + ", balance=" + balance + "]");
	}
}
