/*
 * Joe O'Regan
 * A00258304
 * 07/08/2018
 * Java: Car Factory (Revision)
 */
package ait.java.wk7.CarFactoryREVISION;

import java.util.ArrayList;

public class CarDB {
	ArrayList<Car> cars;
	public static int numberOfCars = 0;

	public CarDB() {
		cars = new ArrayList<Car>();
		//cars.add(new Car("12MO1234","","","Silver"));
		//cars.add(new Car("131WH3485","","",""));
	}

	public void addCar(Car car) {
		if (car != null) {
			cars.add(car);
			//System.out.println("Car has been added");
			numberOfCars++;
		}
	}

	public Car findCarByReg(String registration) {
		for (Car car : cars) {
			if (car.getRegistration().equalsIgnoreCase(registration)) {
				return car;
			}
		}
		return null;
	}
}
