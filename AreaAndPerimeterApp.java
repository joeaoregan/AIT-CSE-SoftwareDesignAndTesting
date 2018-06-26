import java.util.Scanner;

public class AreaAndPerimeterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length, width, area, perimeter;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println("Enter length: ");
		length = sc.nextDouble();
		System.out.println("Enter width:  ");
		width = sc.nextDouble();
		area = length * width;
		System.out.println("Area:         "+area);
		perimeter = (length * 2) + (width * 2);
		System.out.println("Perimeter:    "+perimeter);
	}

}
