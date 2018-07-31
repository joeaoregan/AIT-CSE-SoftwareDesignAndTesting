/*
 * Joe O'Regan
 * A00258304
 * 31/07/2018
 * Java Testing - 3. Unit Testing
 */
package ait.sdt.wk6;

import java.util.ArrayList;

public class CatPound {
	private ArrayList<Cat> catCollection;

	public CatPound() {
		catCollection=new ArrayList<Cat>();
	}
	
	public void addCat(Cat cat) {
		catCollection.add(cat);
	}

	public int getNumberOfCats() {
		return catCollection.size();
	}

	public void removeCat(Cat cat) {
		catCollection.remove(cat);
	}

	public Boolean searchCatName(String name) {
		for (Cat cat: catCollection) {
			if (cat.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public Boolean findCat(Cat cat) {
		for (Cat catSearched: catCollection) {
			if (catSearched == cat) {
				return true;
			}
		}
		return false;
	}

	public int getNumberOlderThan() {
		int amount = 0;
		for (Cat cat : catCollection) {
			if (cat.getAge() > 2) {
				amount++;
			}
		}
		return amount;
	}
}
