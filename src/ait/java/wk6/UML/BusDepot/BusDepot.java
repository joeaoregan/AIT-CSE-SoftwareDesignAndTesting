/*
 * Joe O'Regan
 * A00258304
 * 30/07/2018
 * Java Lab: 5 Bus Depot
 */
package ait.java.wk6.UML.BusDepot;

public class BusDepot {

	public static void main(String[] args) {
		Driver driverOne = new Driver();
		driverOne.setName("John");
		driverOne.setPhoneNumber(110);

		Bus busOne = new Bus();
		busOne.setMake("Volvo");
		busOne.setNumberOfSeats(45);
		busOne.setDriver(driverOne);

		System.out.println(busOne);

		Bus busTwo = new Bus();
		busTwo.setMake("Mercedes");
		busTwo.setNumberOfSeats(50);

		System.out.println(busTwo);

		Driver driverTwo = new Driver("Tom", 999);
		Bus busThree = new Bus("Ford", 20, driverTwo);

		System.out.println(busThree);
	}

}
