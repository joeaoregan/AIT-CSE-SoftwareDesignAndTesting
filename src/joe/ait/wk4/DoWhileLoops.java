package joe.ait.wk4;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		//largestNumberOf5();
		//squares();
		doWhilecontinue();
	}

	static void largestNumberOf5() {
		Scanner sc = new Scanner(System.in);
		
		int input, largest = 0, count = 0;
		
		do {
			count++;
			System.out.print("Enter a number : ");
			input = sc.nextInt();
			largest = input;
		} while (count < 5);
				
		System.out.println("Largest is " + largest);
		
		sc.close();
	}
	
	static void squares() {
		int num = 1, total = 0;
		do {
			int output = (int) Math.pow(num, 2);
			System.out.println(output);
			total += output;
			num++;
		} while (num <= 5);
		
		System.out.println("Total is " + total);
	}
	
	static void doWhilecontinue() {
		int num = 0;
		do {
			if (++num == 7) {
				continue;
			}		
			System.out.println(num);	
		} while (num < 10);
	}
}
