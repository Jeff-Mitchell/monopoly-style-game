/**
 * 
 */
package artemisLite;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	// Stuart: made NUM_SQUARES protected in board class so is available project
	// wide to remove
	// duplicate and easy update
	// private static final int NUM_SQUARES = 12;

	// JASON: I've added gameOver as a condition which will exit the game and can be
	// triggered in various circumstances (e.g. bankruptcy, victory, user quitting).
	protected static boolean gameOver = false;

	protected static ArrayList<Player> players = new ArrayList<Player>();
	protected static ArrayList<Square> board = Board.createBoard();
	// Instantiates the scanner class to allow user input.
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to Artemis Lite");

		// JASON: I'd like to add a "Show rules" method here, which would ask the user
		// if they want to see the rules of the game.

		GameActions.setNumberOfPlayers();
		GameActions.showAllPlayerStats();

		// JEFF: Added beginnings of show rules code.
		GameActions.showRules();

		// Stuart: game in do while loop with condition gameOver = true
		// any methods that cause game to end i.e bankrupt / quit will set gameOver =
		// false
		do {

			// Stuart: For loop through an arrayList of players?
			for (Player player : players) {

				// roll
				int playerRoll = GameActions.rollDice(player);

				player.setPosition(playerRoll);

				GameActions.landOnSquare(player);

				// game conditions

				// print each player 1s stats
				// System.out.println(players.get(0).toString());

				// scanner to ask look at next player stats?
				// create loop to continue printing all players that exists stats.
				// System.out.println("Continue to next players stats?");
			}

		} while (!gameOver);

		// game now over

	}
}
