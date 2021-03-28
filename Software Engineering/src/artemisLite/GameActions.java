/**
 * 
 */
package artemisLite;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Stuart McCann, Jason McKillen
 *
 */
public class GameActions {
	protected static Scanner scanner = new Scanner(System.in);

	/**
	 * Prompts the user to enter the number of players
	 */
	public static void setNumberOfPlayers() {

		// Requires the user to enter an integer value of the number of players
		System.out.println("Please enter the number of players between 2 and 4 (inclusive).");
		int numberOfPlayers = scanner.nextInt();

		// Checks if the number of players is invalid and prompts the user to enter a
		// valid number.
		// JASON: I'd like to add an escape function here, where the player can enter a
		// number to quit the game.
		while (numberOfPlayers < 2 || numberOfPlayers > 4) {
			System.out
					.println("Invalid number of players. Please enter a number between 2 and 4, or press 0 to leave.");
			numberOfPlayers = scanner.nextInt();
			// Stuart: added if statement for escape function to call quit game method
			if (numberOfPlayers == 0) {
				GameActions.quitGame();
			}

		}

		// Loops through each player and prompts them to enter their name.
		for (int loop = 0; loop < numberOfPlayers; loop++) {
			System.out.println("Please enter player " + (loop + 1) + "'s name");

			String playerName = scanner.next();

			// Creates a new instance of the Player class and adds it to the Players
			// ArrayList
			Player player = new Player(playerName);
			Game.players.add(player);
			System.out.println(playerName + " added successfully.");
		}
	}

	/**
	 * 
	 * @return
	 */
	public static int rollDice(Player player) {

		// Prompts the user to roll the dice.
		System.out.println(player.getPlayerName() + ", are you ready to roll the dice? Y/N");
		String userInput = scanner.next();

		// Ensures that the user is ready to roll the dice.
		while (!userInput.equalsIgnoreCase("Y")) {
			System.out.println("Enter Y when you are ready to roll the dice.");
			userInput = scanner.next();
		}

		Random random = new Random();

		// Adds one to the dice value in order to avoid returning a value of 0.
		int diceValue = random.nextInt(12) + 1;

		// Tells the user what value they rolled.
		System.out.println("You rolled a " + diceValue);

		return diceValue;
	}

	/**
	 * 
	 */
	public static void showAllPlayerStats() {
		System.out.println("Would you like to see the attributes of all players? (Y/N)");
		String isWantingStats = scanner.next();

		if (isWantingStats.equalsIgnoreCase("Y")) {
			for (Player player : Game.players) {
				player.printAll();
			}
		}

	}

	/**
	 * 
	 */
	public static void showRules() {
		System.out.println("Would you like to read the rules of the game? (Y/N)");
		String wantsRules = scanner.next();

		if (wantsRules.equalsIgnoreCase("Y")) {
			System.out.println("\n|--------------------------------" + "\n|**TYPE UP RULES LATER**"
					+ "\n|--------------------------------");
		}
	}

	/**
	 * When the player selects Quit game gameOver is set to false and final game
	 * stats are displayed
	 */
	public static void quitGame() {

		System.out.println("Are you sure you want to quit? Enter Y OR N");
		String wantsToQuit = scanner.next();
		if (wantsToQuit.equalsIgnoreCase("Y")) {
			Game.gameOver = true;
			System.out.println("Thank you for playing Artemis Lite");
			System.out.println("Your final progress: ");
			// showGameProgress()
		} else if (wantsToQuit.equalsIgnoreCase("N")) {
			System.out.println("You have decided to continue your Artemis Lite mission to the Moon");
		}

	}
	
	/**
	 * 
	 * @param player
	 */
	public static void landOnSquare(Player player) {

		int squareNumber = player.getPosition();
		Square square = Game.board.get(squareNumber);
		SquareType squareType = square.getSquareType();

		if (player.isPassGo()) {
			passGo(player);
		}

		System.out.println("You have landed on square " + player.getPosition());
		if (square instanceof Element) {
			// check ownership /rent
		} else if (square instanceof Chance) {
			// chance method
		} else {
			// go method
		}
		System.out.println("This this square is " + squareType);

		// display options method

	}

	/**
	 * 
	 * @param player
	 */
	public static void passGo(Player player) {
		
		System.out.println("You have passed through " + SquareType.KENNEDY_SPACE_CENTRE);
		System.out.println("Great news! You have recieved funding of " + Go.GO_FUNDING);
		player.setPassGo(false);

	}
}