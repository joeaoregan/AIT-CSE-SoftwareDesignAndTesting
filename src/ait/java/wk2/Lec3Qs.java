/*
 * Joe O'Regan
 * A00258304
 */
package ait.java.wk2;

import java.text.NumberFormat;
import java.util.Locale;
import java.math.*;

public class Lec3Qs {

	public static void main(String[] args) {
		//int userNumber = 14;
		//String userEntry = "two";
		
		//userNumber = Integer.parseInt(userEntry);
		//System.out.println(userNumber);
		
		//float a = 1.0f;
		//short c = 1;
		//long d = 1.0;
		//System.out.println(a);
		//System.out.println(c);
		//System.out.println(d);
		/*
		int a=5,b=2,c=10;
		System.out.println(c + a * b - 5);
		
		double x = 2.5, y = 4.0;
		int z = (int) (x + y);
		System.out.println(z);
		
		double percent = 0.0755;
		String p = NumberFormat.getPercentInstance().format(percent);
		System.out.println(p);
		
		int input = 755;
		NumberFormat n = NumberFormat.getNumberInstance();
		n.setMinimumFractionDigits(3);
		String r = n.format(input);
		System.out.println(r);
		*/
		/*
		// 18
		int x2 = 100;
		float y2 = 1.587f;
		double z2 = 4.8;
		
		System.out.println(x2 + Math.round(y2) + (int) z2);
		*/
		// 19
		//double totalOne = 6.72;
		//int totalTwo = 116;
		/*
		BigDecimal totalOne = new BigDecimal(6.72);
		BigDecimal totalTwo = new BigDecimal(116);
		
		totalOne = totalOne.setScale(2,  RoundingMode.HALF_UP);
		BigDecimal totalFinal = totalTwo.add(totalOne);
		
		System.out.println(totalFinal);
		
		int quantity = 5;
		int total = quantity++;
		System.out.println(total);
		
		int a = 3, b = 4;
		double c = (double) a/b;
		System.out.println(c);
		
		//double percent=0.0755;
		//String p = NumberFormat.getPercentInstance().format(percent);
		//System.out.print(p);
		
		double percentChange = .10515;
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(2);
		
		String percentString = percent.format(percentChange);
		System.out.println(percentString);
		
		// 6
		double total2 = 1000.01;
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.ITALY);
		String totalString = currency.format(total2);
		System.out.println("Total: " + totalString);
		
		// 7
		int random = (int)(Math.random() * 10);
		System.out.println(random);
		
		// 8
		double thisYTDSales = 5.5, lastYTDSales = 3.0;
		int salesChange = (int) (thisYTDSales - lastYTDSales);
		System.out.println(salesChange);
		
		// 9
		int count = 0;
		int countObject = count;
		
		// 10
		double subtotal = 5.05;
		String subtotalString = Double.toString(subtotal);
		System.out.println("subtotalString "+subtotalString);
		
		// 11
		String totalString2 = "2.5";
		double total3 = Double.parseDouble(totalString2);
		System.out.println("Total: "+total3);
		
		// 12
		double subTotal12 = 2.5;
		BigDecimal bg = new BigDecimal(Double.toString(subTotal12));
		bg.setScale(5, RoundingMode.HALF_UP);
		System.out.println(bg);
		*/
		// 13
		BigDecimal thisYTDqty = new BigDecimal(17.5);
		BigDecimal lastYTDqty = new BigDecimal(2.5);
		
		BigDecimal percentChange = thisYTDqty.divide(lastYTDqty);
		percentChange.setScale(2,  RoundingMode.HALF_UP);
		System.out.println(percentChange);
	}

}
