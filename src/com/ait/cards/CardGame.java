/*
 * A00258304
 */
package com.ait.cards;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CardGame {
	private static final String[] suit = { "H", "C", "S", "D" };
	private static final String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };
	private static Card[] cards = new Card[52];
	private static ArrayList<Player> players = new ArrayList<Player>();

	private static Scanner sc = new Scanner(System.in);
	private static int numPlayers;

	public static void main(String[] args) {
		loadCardArray();
		System.out.println("Printing the initialised Card Array.....");
		printCardArray();
		addPlayers();
		shuffleCards();
		System.out.println("Printing the shuffled Card Array");
		printCardArray();
		dealHands();
		showHands();
		checkForWinner();
	}

	private static void loadCardArray() {
		int cardIndex = 0;

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {
				cards[cardIndex++] = new Card(suit[j], rank[i]);
			}
		}

	}

	private static void printCardArray() {
		for (int j = 0; j < 4; j++) {
			for (int i = 13 * j; i < 13 * (j + 1); i++) {
				System.out.print(
						cards[i].getCardRank() + "-" + cards[i].getCardSuit() + (((i + 1) % 13 == 0) ? "" : ", "));
			}
			
			System.out.println();
		}
	}

	private static void addPlayers() {
		numPlayers = 1;
		char addPlayer = 'y';

		System.out.println("Adding players");
		System.out.println("Who wants to play");

		while (addPlayer == 'y') {
			System.out.println("Enter name for player " + numPlayers++ + " :");
			players.add(new Player(sc.next()));
			System.out.println("Add another player? (y/n):");
			addPlayer = sc.next().charAt(0);
		}

		int i = 1;
		System.out.println("The following players have been added");
		
		for (Player player : players) {
			System.out.println("Player" + (i++) + " " + player.getName());
		}
	}

	private static void dealHands() {
		System.out.println("Dealing Cards...");
		int next5Cards = 0;

		for (Player player : players) {
			Card[] hand = new Card[5];

			for (int i = 0; i < 5; i++) {
				hand[i] = cards[i + (next5Cards * 5)];
			}
			
			next5Cards++;

			player.setHand(hand);
		}
	}

	private static void showHands() {
		System.out.println("Showing hands of cards for each player");
		
		for (Player player : players) {
			System.out.println(player.toString());
		}
	}

	private static void checkForWinner() {
		System.out.println("Has anybody got the Ace of Hearts?");
		Boolean winner = false;
		
		for (Player player : players) {
			if (player.checkForAceOfHearts()) {
				System.out.println("Winner is " + player.getName());
				winner = true;
			}
		}
		
		if (!winner) {
			System.out.println("No Winner");
		}
	}

	private static void shuffleCards() {
		System.out.println("Shuffling Card Array...");
		Card temp;
		int index;
		Random random = new Random();
		for (int i = cards.length - 1; i > 0; i--) {
			index = random.nextInt(i + 1);
			temp = cards[index];
			cards[index] = cards[i];
			cards[i] = temp;
		}
	}
}
