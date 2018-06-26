import java.util.Scanner;

public class InvoiceApplicationV1 {
	public static void main(String[] args) {
		double subtotal = 100;
		double discountPercent = 0.2;
		double discountAmount = subtotal * discountPercent;
		double total = subtotal - discountAmount;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println();	// print a blank line
			// display the discount amount and total
		System.out.println("Enter Subtotal:         ");
		subtotal = input.nextDouble();
		
		System.out.println("Enter Discount percent: ");
		discountPercent = input.nextDouble();
		System.out.println("Subtotal:               "+subtotal);
		System.out.println("Discount percent:       "+discountPercent);
		discountAmount = subtotal * (100 - discountPercent) / 100;
		System.out.println("Discount amount:        "+discountAmount);
		total = subtotal - discountAmount;
		System.out.println("Total:                  "+total);
		
		input.close();// close the scanner		
	}
}
