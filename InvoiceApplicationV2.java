import java.util.Scanner;

public class InvoiceApplicationV2 {
	public static void main(String[] args) {
		double subtotal = 0.0;
		double discountPercent = 0.0;
		double discountAmount = 0.0;
		double discountTotal = 0.0;
		double total = 0.0;
		String continueStr = "y";
		int numInvoices = 0;
		int numDiscounts = 0;
		double invoiceTotal = 0.0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Invoice Total Calculator");
		
		// display the discount amount and total

		while (continueStr.equalsIgnoreCase("y")) {
			System.out.print("\nEnter Subtotal:         ");
			subtotal = sc.nextDouble();
			
			if (subtotal >= 500.0) {												// Values greater than 500, 25% discount
				discountPercent = 0.25;
			} else if (subtotal >= 200) {											// Values greater than 200, 20%
				discountPercent = 0.2;
			} else if (subtotal >= 100) {											// Values greater than 100, 10%
				discountPercent = 0.1;
			} else if (subtotal < 100) {											// Values less than 100, no discount
				discountPercent = 0.0;
			}

			if (discountPercent > 0.0) {
				numDiscounts++;
			}
			
			System.out.println("Discount percent:       "+discountPercent);
			discountAmount = subtotal * discountPercent;
			System.out.println("Discount amount:        "+discountAmount);
			total = subtotal - discountAmount;
			System.out.println("Invoice total:          "+total);
			
			invoiceTotal += (subtotal - discountAmount);
			discountTotal += discountAmount;
			numInvoices++;
			

			System.out.print("\ncontinue? (y/n):        ");
			continueStr = sc.next();
		}

		System.out.println("\nNumber of invoices:     "+numInvoices);					// Number of invoices added
		System.out.println("Average invoice:        "+invoiceTotal/numInvoices);	// Average invoice
		System.out.println("Average discount:       "+discountTotal/numDiscounts);	// Average discount
			
		sc.close();// close the scanner		
	}
}
