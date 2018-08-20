/*
 * A00258304
 */
package com.ait.cards;

public class Player {
	private String name;
	Card[] hand = new Card[5];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHand(Card[] hand) {
		this.hand = hand;
	}

	public boolean checkForAceOfHearts() {
		// return true if the players hand contains the Ace of hearts, otherwise false
		// return true for compilation
		for (int i = 0; i < hand.length; i++) {
			if (hand[i].getCardRank() == "Ace" && hand[i].getCardSuit() == "H") {
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		// return String
		String playerHand = "Hand of cards for " + name + " is ";

		for (int i = 0; i < hand.length; i++) {
			String handStr = hand[i].getCardRank() + "-" + hand[i].getCardSuit();
			playerHand += handStr + " ";
		}

		return playerHand;
	}

}
