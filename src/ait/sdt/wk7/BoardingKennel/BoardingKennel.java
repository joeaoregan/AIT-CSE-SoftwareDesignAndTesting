package ait.sdt.wk7.BoardingKennel;

import java.util.ArrayList;

public class BoardingKennel {
	private int maxNumCats;
	private int maxNumDogs;
	private Boolean virusInKennelStatus;
	
	ArrayList<Pet> pets = new ArrayList<Pet>();

	public BoardingKennel() {
		maxNumCats = 0;
		maxNumDogs = 0;
		virusInKennelStatus = false;
	}
	
	public int getCurrentNumCats() {
		/*
		int numCats = 0;
		for (Pet pet : pets) {
			if (pet.getPetName().toLowerCase().equals("cat")) {
				numCats++;
			}
		}
		return numCats;
		*/
		return maxNumCats;
	}

	public int getCurrentNumDogs() {
		return maxNumDogs;
	}

	public String checkInPet(Pet pet) {

		if (virusInKennelStatus) {
			return "KENNEL CLOSED";
		}
		
		if (!pet.getVacinationStatus()) {
			return "NOT VACINATED";
		}
		
		if (!pet.getPetType().toLowerCase().equals("cat") && !pet.getPetType().toLowerCase().equals("dog")) {
			return "NOT A CAT OR DOG";
		}
		
		if (maxNumDogs >= 2 && pet.getPetType().toLowerCase().equals("dog")) {
			return "MAXNUMDOGS";
		} else if (maxNumDogs < 2 && pet.getPetType().toLowerCase().equals("dog")) {
			maxNumDogs++;
		}
		if (maxNumCats >= 3 && pet.getPetType().toLowerCase().equals("cat")) {
			return "MAXNUMCATS";
		} else if (maxNumCats < 3 && pet.getPetType().toLowerCase().equals("cat")) {
			maxNumCats++;
		}

		pets.add(pet);
		return "OK";
	}

	public ArrayList<Pet> findPetByName(String petName) {
		ArrayList<Pet> namedPets = new ArrayList<Pet>();
		int count = 0;

		//System.out.println(++count);
		for (Pet pet : pets) {
			//System.out.println(++count);
			if (pet.getPetName().equalsIgnoreCase(petName)) {
				namedPets.add(pet);
			}
		}
		
		return namedPets;
	}

	public void setVirusInKennelStatus(Boolean virusInKennelStatus) {
		this.virusInKennelStatus = virusInKennelStatus;		
	}
}
