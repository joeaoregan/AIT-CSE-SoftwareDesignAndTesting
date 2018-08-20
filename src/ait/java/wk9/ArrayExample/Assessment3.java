package ait.java.wk9.ArrayExample;

import java.util.ArrayList;
import java.util.Scanner;

public class Assessment3 {
	private static Scanner sc = new Scanner(System.in);
	static Prisoner prisoner = new Prisoner();
	// private static String inmateNumber;
	// private static String prisonersName;
	// private static double sentence;
	
	private static int lifers;

	public static void main(String[] args) {
		ArrayList<Prisoner> prisoners = new ArrayList<Prisoner>();

		System.out.println("Prisoner register");

		int choice;

		while (true) {
			System.out.println("What do you want to do ?");
			System.out.println("1. Add a prisoner");
			System.out.println("2. Change a prisoners sentence");
			System.out.println("3. Release a prisoner");
			System.out.println("4. How many lifers?");
			System.out.println("5. Show prisoners");
			System.out.println("6. Exit");

			choice = userChoice();

			System.out.println("Enter the inmate number --> ");
			// inmateNumber = sc.next();
			prisoner.setInmateNumber(sc.next());
			System.out.println("Enter the prisoners name --> ");
			// prisonersName = sc.next();
			prisoner.setName(sc.next());
			System.out.println("Enter the prisoners sentence --> ");
			// sentence = sc.nextDouble();
			prisoner.setSentence(sc.nextDouble());

			if (choice == 1) {
				addPrisoner(prisoners);
			}
			if (choice == 2) {
				
			}
			if (choice == 4) {
				howManyLifers(prisoners);
			}
		}
	}

	public static int userChoice() {
		System.out.println("Enter choice --> ");
		int choice = sc.nextInt();
		return choice;
	}

	public static void addPrisoner(ArrayList<Prisoner> prisoners) {
		// prisoners.add(new Prisoner(inmateNumber, prisonersName, sentence));
		if (prisonerAlreadyExists(prisoner.getInmateNumber(), prisoners) == 0) {
			prisoners.add(prisoner);
		}
	}

	public static int prisonerAlreadyExists(String inmateNumber, ArrayList<Prisoner> prisoners) {
		for (Prisoner prisoner : prisoners) {
			if (inmateNumber.equals(prisoner.getInmateNumber())) {
				System.out.println("Prisoners " + inmateNumber + " already exists ...");
			}
			return 1;
		}
		return 0;
	}

	public static void changePrisonerSentence(ArrayList<Prisoner> prisoners) {
		System.out.println("Enter the inmate number --> ");
		String inmateNum = sc.next();
		System.out.println("Enter the new sentence --> ");
		double newSentence = sc.nextDouble();
		for (Prisoner prisoner : prisoners) {
			if (inmateNum.equals(prisoner.getInmateNumber())) {
				prisoner.setSentence(newSentence);
			}
		}
	}

	public void releasePrisoner(ArrayList<Prisoner> prisoners) {

	}

	public static void howManyLifers(ArrayList<Prisoner> prisoners) {
		System.out.println("Number of lifers: ");
		lifers = sc.nextInt();
	}
}
