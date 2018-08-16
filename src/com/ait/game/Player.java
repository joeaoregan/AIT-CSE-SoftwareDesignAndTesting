/*
 * A00258304
 */
package com.ait.game;

public class Player {
	private String name;
	private int totalScore;

	public Player(String name) {
		this.name = name;
		totalScore = 0;
	}

	public String getName() {
		return name;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "Current score for " + name + " is " + totalScore;
	}
}
