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

		Car car1 = new Car("12MO1234", "VW", "Passat", "Silver");
		Car car2 = new Car("131WH3485");
		carDB.addCar(car1);
		carDB.addCar(car2);

		System.out.println("Welcome to the Car Application");
		getCarRegistration();
	}

	static void getCarRegistration() {
		Car car;
		String registration = "", colour;
		char input;

		while (true) {
			System.out.println("------------------------------------------------------");
			System.out.println("What do you want to do?");
			System.out.println("Enter 'a' to add a new car");
			System.out.println("Enter 'f' to fetch a cars details by its registration");
			System.out.println("Enter 'c' to change car colour");
			System.out.println("Enter 'k' to update no. of kilometers");
			System.out.println("Enter 'q' to quit");

			input = sc.next().charAt(0);
			if (input != 'q') {
				System.out.println("Enter car registration");
				registration = sc.next();
			}

			switch (input) {
			case 'a':
				System.out.println("Enter car make");
				String make = sc.next();
				System.out.println("Enter car model");
				String model = sc.next();
				System.out.println("Enter car colour");
				colour = sc.next();

				carDB.addCar(new Car(registration, make, model, colour));
				System.out.println("Car has been added");
				break;
			case 'f':
				car = carDB.findCarByReg(registration);

				if (car != null) {
					System.out.println(car.toString());
				} else {
					System.out.println("Car not found");
				}
				break;
			case 'c':
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
				break;
			case 'k':
				car = carDB.findCarByReg(registration);
				int oldKm = car.getKilometers();
				System.out.println("Enter no. of kilometers");
				int km = sc.nextInt();
				if (km >= oldKm) {
					car.setKilometers(km);
					System.out.println("Kilometers is now " + car.getKilometers());
				} else {
					System.out.println("Sorry you put back the odometer");
				}
				break;
			case 'q':
				System.out.println(Car.getNumberOfCars() + " cars have been created");
				System.out.println("Good bye!!");
				break;
			}

		}

	}
}
