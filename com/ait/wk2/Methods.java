// 03/07/2018
// Methods
// Return types can be any of the data types we have used
package com.ait.wk2;

public class Methods {

	public static void main(String[] args) {
		printName();
		int a=5;
		int b=5;
		
		int result = addNumber(a,b);				// returns value of a added to b and stores the value in result
		System.out.println("Result is "+result);
		System.out.println(addNumber(3,4));			// Not storing the value, just printing
		
		String name = getName();
		
		System.out.println(name);
		
		double invest = calculateFutureValue(100.0, 0.1, 2);
		System.out.println(invest);
	}
	
	// return type void, no value is returned
	private static void printName() {
		System.out.println("Joe Blogs");
	}
	
	// Returns value of type int
	private static int addNumber(int a,int b) {
		return a+b;
	}
	
	private static String getName() {		
		return "Joe";
	}
	
	public static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months) {
		double futureValue = 0.0;
		for (int i = 1; i <= months; i++) {
			futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
		}
		return futureValue;
	}
}
