/*
 * Joe O'Regan
 * A00258304
 * 31/07/2018
 * Java Lab - UML - 6 Car Factory
 */
package ait.java.wk6.UML.CarFactory;

import java.util.Scanner;

public class CarFactory {
	private static Scanner sc = new Scanner(System.in);

	private static CarDB carDB = new CarDB();

	public static void main(String[] args) {
		Car car;
		String registration = "", colour;
		
		carDB.addCar(new Car("12MO1234", "VW", "Passat", "Silver"));
		carDB.addCar(new Car("131WH3485", "Ford", "Focus", "Red"));

		System.out.println("Welcome to the Car Application");

		while (true) {
			System.out.println("------------------------------------------------------");
			System.out.println("What do you want to do?");
			System.out.println("Enter 'a' to add a new car");
			System.out.println("Enter 'f' to fetch a cars details by its registration");
			System.out.println("Enter 'c' to change car colour");
			System.out.println("Enter 'k' to update no. of kilometers");
			System.out.println("Enter 'q' to quit");

			char input = sc.next().charAt(0);
			if (input != 'q') {
				registration = getCarRegistration();
			}

			if (input == 'a') {
				System.out.println("Enter car make");
				String make = sc.next();
				System.out.println("Enter car model");
				String model = sc.next();
				System.out.println("Enter car colour");
				colour = sc.next();
				carDB.addCar(new Car(registration, make, model, colour));
			} else if (input == 'f') {
				car = carDB.findCarByReg(registration);

				if (car != null) {
					System.out.println(car.toString());
				} else {
					System.out.println("Car not found");
				}
			} else if (input == 'c') {
				car = carDB.findCarByReg(registration);
				if (car != null) {
					String oldColour = car.getColour();					
					System.out.println("The car is currently " + oldColour);
					
					System.out.println("Enter new colour");
					colour = sc.next();
					car.setColour(colour);
					System.out.println("Colour for " + car.getRegistration() + " changed from " + oldColour + " to "
							+ car.getColour());
				} else {
					System.out.println("Car not found");
				}
			} else if (input == 'k') {
				car = carDB.findCarByReg(registration);
				
				System.out.println("Enter no. of kilometers");
				int km = sc.nextInt();
				
				if (km >= car.getKilometers()) {
					car.setKilometers(km);
					System.out.println("Kilometers is now " + car.getKilometers());
				} else {
					System.out.println("Sorry you put back the odometer");
				}
			} else if (input == 'q') {
				System.out.println(Car.getNumberOfCars() + " cars have been created\nGood bye!!");
				break;
			}
		}
	}

	static String getCarRegistration() {
		System.out.println("Enter car registration");
		return sc.next();
	}
}
