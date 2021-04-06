/**
 * 
 */
package artemisLite;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Stuart McCann
 * @author Jason McKillen
 * @author Mark Davidson
 * @author Jeff Mitchell
 * 
 * TODO: JavaDoc methods and variables
 *
 */
public class Game {

	// Stuart: made NUM_SQUARES protected in board class so is available project
	// wide to remove
	// duplicate and easy update
	// private static final int NUM_SQUARES = 12;

	protected static boolean gameOver = false;

	protected static ArrayList<Player> players = new ArrayList<Player>();
	protected static ArrayList<Square> board = Board.createBoard();

	public static void main(String[] args) {

		System.out.println("Welcome to Artemis Lite");

		GameActions.setNumberOfPlayers();

		// Stuart: game in do while loop with condition gameOver = true
		// any methods that cause game to end i.e bankrupt / quit will set gameOver =
		// false
		
		GameActions.showAllPlayerStats();
		GameActions.showRules();
		do {

			

			// Stuart: For loop through an arrayList of players?
			for (Player player : players) {

				// Rolls the dice
				int playerRoll = GameActions.rollDice(player);

				// Moves the player to their new position from the dice roll
				player.setPosition(playerRoll);

				// Shows the player information about their new position and their available
				// choices
				GameActions.landOnSquare(player);
				
				GameActions.showMenu(player);

				// Checks if the conditions necessary to win the game have been met
				GameActions.checkWinConditions();
			}

		}while (!gameOver); 

		// game now over

	}
}
