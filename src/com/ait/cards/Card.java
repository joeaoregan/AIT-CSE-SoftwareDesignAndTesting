package com.ait.cards;

public class Card {
	private String cardSuit;
	private String cardRank;

	public Card(String cardSuit, String cardRank) {
		this.cardSuit = cardSuit;
		this.cardRank = cardRank;
	}

	public String getCardSuit() {
		return cardSuit;
	}

	public String getCardRank() {
		return cardRank;
	}

}
