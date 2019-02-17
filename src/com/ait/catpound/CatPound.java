package com.ait.catpound;

import java.util.ArrayList;

public class CatPound {
	private ArrayList<Cat> catCollection;
	
	public CatPound() {
		catCollection=new ArrayList<Cat>();
	}
	
	public int getNumberOfCats() {
		return catCollection.size();
	}
	
	public void addCat(Cat cat) {
		catCollection.add(cat);
	}
	
}
