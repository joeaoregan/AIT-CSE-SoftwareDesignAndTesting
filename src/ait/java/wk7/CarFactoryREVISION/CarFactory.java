/*
 * Joe O'Regan
 * A00258304
 * 07/08/2018
 * Java: Car Factory (Revision)
 */
package ait.java.wk7.CarFactoryREVISION;

import java.util.Scanner;

public class CarFactory {

	public static Scanner sc = new Scanner(System.in);
	static String registration;

	public static void main(String[] args) {
		CarDB carDB = new CarDB();
		sc = new Scanner(System.in);
		//Car car = new Car("", "", "", "");
				
		carDB.addCar(new Car("12MO1234","VW","Passat","Silver"));
		carDB.addCar(new Car("131WH3485","","",""));
		
		String make, model, color;

		System.out.println("Welcome to the Car Application");
		char input = 'x';
		
		while (input != 'q') {
			System.out.println("------------------------------------------------------");
			System.out.println("What do you want to do?");
			System.out.println("Enter 'a' to add a new car");
			System.out.println("Enter 'f' to fetch a cars details by its registration");
			System.out.println("Enter 'c' to change car color");
			System.out.println("Enter 'k' to update no. of kilometers");
			System.out.println("Enter 'q' to quit");
			input = sc.next().charAt(0);
			if (input == 'a') {
				getCarRegistration();
				System.out.println("Enter car make");
				make = sc.next();
				System.out.println("Enter car model");
				model = sc.next();
				System.out.println("Enter car color");
				color = sc.next();
				carDB.addCar(new Car(registration, make, model, color));
				System.out.println("Car has been added");
			} else if (input == 'f') {
				getCarRegistration();
				// System.out.println("reg: " + registration);
				if (carDB.findCarByReg(registration) != null) {
					System.out.println(carDB.findCarByReg(registration).toString());
				} else {
					System.out.println("Car not found");
				}
			} else if (input == 'c') {
				getCarRegistration();
				System.out.println("Enter new color");
				String newColor = sc.next();
				String oldColor = carDB.findCarByReg(registration).getColor();
				System.out.println("Color for " + registration + " changed from " + oldColor + " to " + newColor);
				carDB.findCarByReg(registration).setColor(newColor);
			} else if (input == 'k') {
				getCarRegistration();
				System.out.println("Enter no. of kilometers");
				int newKm = sc.nextInt();
				int oldKm = carDB.findCarByReg(registration).getKilometers();
				if (newKm >= oldKm) {
					carDB.findCarByReg(registration).setKilometers(newKm);
					System.out.println("Kilometers is now " + newKm);
				} else {
					System.out.println("Sorry you put back the odometer");
				}
			} else if (input == 'q') {
				System.out.println(CarDB.numberOfCars + " cars have been created");
				System.out.println("Good bye!!");
				break;
			}
		}
		
		sc.close();
	}

	public static void getCarRegistration() {
		System.out.println("Enter car registration");
		registration = sc.next();
	}
}
