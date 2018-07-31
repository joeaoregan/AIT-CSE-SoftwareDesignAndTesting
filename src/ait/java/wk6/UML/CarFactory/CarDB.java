/*
 * Joe O'Regan
 * A00258304
 * 31/07/2018
 * Java Lab - UML - 6 Car Factory
 */
package ait.java.wk6.UML.CarFactory;

import java.util.ArrayList;

public class CarDB {
	private ArrayList<Car> carList;

	public CarDB() {
		carList = new ArrayList<Car>();
		// Car car1 = new Car("12MO1234");
		// Car car2 = new Car("131WH3485");
		// carList.add(car1);
		// carList.add(car2);
	}

	public int size() {
		return carList.size();
	}

	public void addCar(Car car) {
		carList.add(car);
	}

	public Car findCarByReg(String registration) {
		Car findCar = null;
		for (Car car : carList) {
			if (car.getRegistration().equals(registration)) {
				findCar = car;
			}
		}
		return findCar;
	}
}
