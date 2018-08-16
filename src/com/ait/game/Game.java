package com.ait.game;

import java.util.Scanner;

/*
 * A00258304
 */
public class Game {
	private static Scanner sc;
	private int numDiceRolls;
	private final int SCORE_TO_WIN = 20;

	public Game() {
		sc = new Scanner(System.in);
		numDiceRolls = 1;
	}

	public void start() {
		System.out.println("Welcome to the Dice Roller application\n");
		System.out.println("Please enter player one name:");
		Player player1 = new Player(sc.next());
		System.out.println("Please enter player two name:");
		Player player2 = new Player(sc.next());

		PairOfDice dice = new PairOfDice();

		System.out.println("Roll the dice? (y/n)");
		char rollDice = sc.next().charAt(0);

		while (rollDice == 'y') {
			System.out.println("\nRound: " + numDiceRolls++);
			System.out.println("Rolling dice for player one");
			dice.roll();
			System.out.println("Die 1 is " + dice.getValue1());
			System.out.println("Die 2 is " + dice.getValue2());
			player1.setTotalScore(player1.getTotalScore() + dice.getSum());

			System.out.println("Rolling dice for player two");
			dice.roll();
			System.out.println("Die 1 is " + dice.getValue1());
			System.out.println("Die 2 is " + dice.getValue2());
			player2.setTotalScore(player2.getTotalScore() + dice.getSum());

			System.out.println(player1.toString());
			System.out.println(player2.toString());

			if (player1.getTotalScore() < SCORE_TO_WIN && player2.getTotalScore() < SCORE_TO_WIN) {
				System.out.println("No winner yet");
			} else if (player1.getTotalScore() >= SCORE_TO_WIN && player2.getTotalScore() >= SCORE_TO_WIN) {
				System.out.println("DRAW");
				break;
			} else if (player1.getTotalScore() >= SCORE_TO_WIN && player2.getTotalScore() < SCORE_TO_WIN) {
				System.out.println(player1.getName() + " wins");
				break;
			} else if (player1.getTotalScore() < SCORE_TO_WIN && player2.getTotalScore() >= SCORE_TO_WIN) {
				System.out.println(player2.getName() + " wins");
				break;
			}

			System.out.println("Roll the dice again? (y/n)");
			rollDice = sc.next().charAt(0);
		}

		System.out.println("Good bye!");
	}
}
