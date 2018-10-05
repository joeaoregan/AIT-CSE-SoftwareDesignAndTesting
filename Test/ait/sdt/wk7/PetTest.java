package ait.sdt.wk7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PetTest {
	BoardingKennel boardingKennel;

	@BeforeEach
	void setup() {
		boardingKennel = new BoardingKennel();
	}
	
	@Test
	void testPetConstructor() {
		Pet pet = new Pet("dog", true, "Rex");
		assertEquals("dog", pet.getPetType());
		assertTrue(pet.getVacinationStatus());
		assertEquals("Rex",pet.getPetName());
	}

	@Test
	void testZeroDogsInKennel() {
		assertEquals(0, boardingKennel.getCurrentNumDogs());
	}
	
	@Test
	void testZeroCatsInKennel() {
		assertEquals(0, boardingKennel.getCurrentNumCats());
	}
	
	@Test
	void testAddOneCatOK() {
		Pet pet = new Pet("cat", true, "Lucky");
		assertEquals("OK", boardingKennel.checkInPet(pet));
		assertEquals(1, boardingKennel.getCurrentNumCats());
	}
	
	@Test
	void testAddTwoCatsOK() {
		assertEquals("OK", boardingKennel.checkInPet(new Pet("cat", true, "Lucky")));
		assertEquals("OK", boardingKennel.checkInPet(new Pet("cat", true, "Ginger")));
		assertEquals(2, boardingKennel.getCurrentNumCats());
	}
	
	@Test
	void testAddOneDogOK() {
		assertEquals("OK", boardingKennel.checkInPet(new Pet("dog", true, "Blackie")));
		assertEquals(1, boardingKennel.getCurrentNumDogs());
		
	}	
	
	@Test
	void testAddTwoDogsOK() {
		assertEquals("OK", boardingKennel.checkInPet(new Pet("dog", true, "Blackie")));
		assertEquals("OK", boardingKennel.checkInPet(new Pet("dog", true, "Boots")));
		assertEquals(2, boardingKennel.getCurrentNumDogs());
		
	}
	
	@Test
	void testAddOneDogOneCatOK() {
		assertEquals("OK", boardingKennel.checkInPet(new Pet("cat", true, "Lucky")));
		assertEquals(1, boardingKennel.getCurrentNumCats());
		assertEquals("OK", boardingKennel.checkInPet(new Pet("dog", true, "Boots")));
		assertEquals(1, boardingKennel.getCurrentNumDogs());		
	}
	
	@Test
	void testAddDogNotVacinated() {
		assertEquals("NOT VACINATED", boardingKennel.checkInPet(new Pet("dog", false, "Boots")));
		assertEquals(0, boardingKennel.getCurrentNumDogs());		
	}
	
	@Test
	void testAddMaxNumDogs() {
		assertEquals("OK", boardingKennel.checkInPet(new Pet("dog", true, "Blackie")));
		assertEquals("OK", boardingKennel.checkInPet(new Pet("dog", true, "Boots")));
		assertEquals("MAXNUMDOGS", boardingKennel.checkInPet(new Pet("dog", true, "Rover")));
		assertEquals(2, boardingKennel.getCurrentNumDogs());
	}
	
	@Test
	void testAddMaxNumCats() {
		assertEquals("OK", boardingKennel.checkInPet(new Pet("cat", true, "Lucky")));
		assertEquals("OK", boardingKennel.checkInPet(new Pet("cat", true, "Ginger")));
		assertEquals("OK", boardingKennel.checkInPet(new Pet("cat", true, "Paws")));
		assertEquals("MAXNUMCATS", boardingKennel.checkInPet(new Pet("cat", true, "Ren")));
		assertEquals(3, boardingKennel.getCurrentNumCats());
	}
	
	@Test
	void testAddNotCatOrDog() {
		assertEquals("NOT A CAT OR DOG", boardingKennel.checkInPet(new Pet("snake", true, "Hiss")));
	}
	
	@Test
	void testVirusInKennel() {
		boardingKennel.setVirusInKennelStatus(true);
		assertEquals("KENNEL CLOSED", boardingKennel.checkInPet(new Pet("cat", true, "Lucky")));
		assertEquals(0, boardingKennel.getCurrentNumCats());
	}
	
	@Test
	void testSearchByNameFound() {
		boardingKennel.checkInPet(new Pet("cat", true, "Alex"));
		ArrayList<Pet> petNames = boardingKennel.findPetByName("Alex");
		//assertEquals(1, boardingKennel.findPetByName("Alex").size());
		assertEquals(1, petNames.size());
		//assertEquals("Alex", boardingKennel.findPetByName("Alex"))
		//Pet pet1 = petNames.get(0);
		//assertEquals("Alex", pet1.getPetName());
		assertEquals("Alex", petNames.get(0).getPetName());
	}
	
	@Test
	void testSearchByNameNotFound() {
		boardingKennel.checkInPet(new Pet("cat", true, "Alex"));
		assertEquals(0, boardingKennel.findPetByName("AlexOne").size());
	}
	
	@Test
	void testSearchByNameTwoFound() {
		boardingKennel.checkInPet(new Pet("cat", true, "Alex"));
		boardingKennel.checkInPet(new Pet("dog", true, "Alex"));
		//assertEquals(2, boardingKennel.findPetByName("Alex").size());
		ArrayList<Pet> petNames = boardingKennel.findPetByName("Alex");
		assertEquals(2, petNames.size());
		assertEquals("Alex", petNames.get(0).getPetName());
		assertEquals("Alex", petNames.get(1).getPetName());
	}
}
