/*
 * Joe O'Regan
 * A00258304
 * 24/07/2018
 * Constructors 4
 */

package com.ait.wk5.constuctors;

public class Tree {
	private String type;

	public Tree() {
		type = "Beech";
	}

	public Tree(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public String getType(String prefix) {
		return prefix + " " + type;
	}
}
