/**
 * 
 */
package artemisLite;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * @author Stuart McCann, Jason McKillen
 * TODO: Write game rules
 * TODO: JavaDoc methods and variables
 * TODO: Add the buy development class (separated into major and minor developments)
 * TODO: Implement the game winning conditions into the code
 *
 */
public class GameActions {
	protected static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();

	/**
	 * Prompts the user to enter the number of players
	 */
	public static void setNumberOfPlayers() {

		// Requires the user to enter an integer value of the number of players
		System.out.println("Please enter the number of players between 2 and 4 (inclusive).");
		int numberOfPlayers = scanner.nextInt();

		// Checks if the number of players is invalid and prompts the user to enter a valid number.
		while (numberOfPlayers < 2 || numberOfPlayers > 4) {
			System.out.println("Invalid number of players. Please enter a number between 2 and 4, or press 0 to leave.");
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

		if (userInput.equalsIgnoreCase("N")) {
			System.out.println("Would you like to quit the game? Y/N");

		}

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
		boolean isWantingStats = getUserInput();

		if (isWantingStats == true) {
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
		boolean wantsToQuit = getUserInput();
		if (wantsToQuit == true) {
			Game.gameOver = true;
			System.out.println("Thank you for playing Artemis Lite");
			System.out.println("Your final progress: ");
			// showGameProgress()
		} else if (wantsToQuit == false) {
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
		
		// JASON: This appears to be unused but I don't know what the craic is with it. Should it be kept?
		SquareType squareType = square.getSquareType();

		if (player.isPassGo()) {
			passGo(player);
		}

		System.out.println("You have landed on square " + player.getPosition());
		if (square instanceof Element) {
			Element element = (Element) square;
			checkElement(player, element);
		} else if (square instanceof Chance) {
			// chance method
			chanceSquare(player);
		} else {
			// go method
		}

		// display options method

	}

	/**
	 * 
	 * @param player
	 * @param element
	 */
	public static void checkElement(Player player, Element element) {

		System.out.println("You have landed on " + element.getElementName());
		System.out.println("This is part of the " + element.getElementType() + " system");
		if (element.getOwner() == null) {
			System.out.println("No one owns this Element yet. This element costs " + element.getRent()
					+ "- would you like to buy it?");
			boolean wantsToBuy = getUserInput();
			if (wantsToBuy == true) {
				// buy element method
				buyElement(player, element);
			} else {
				// offer to the rest of players
				offerElementToAll(player, element);
			}

		} else if (element.getOwner() == player) {
			System.out.println("You already own this element - would you like to buy a development?");
			// buy development method
		} else {
			System.out.println(element.getOwner().getPlayerName() + " owns this square");
			System.out.println("The rent for this square is: " + element.getRent());
			// Calls the charge rent method
			player.chargeRent(element.getRent());
			System.out.println(player.getPlayerName() + ", your balance is now " + player.getBalance());
			// ask player if he wishes to charge rent
			// if does player.setBalance(-element.getRent())
			// if doesnt output thanks and move on
		}

	}

	/**
	 * 
	 * @param player
	 */
	public static void passGo(Player player) {

		System.out.println("You have passed through " + SquareType.KENNEDY_SPACE_CENTRE);
		System.out.println("Great news! You have recieved funding of " + Go.GO_FUNDING);
		player.setBalance(Go.GO_FUNDING); 
		System.out.println(player.getPlayerName() + ", your balance is now " + player.getBalance());
		player.setPassGo(false);

	}

	/**
	 * 
	 * @param player
	 */
	public static void chanceSquare(Player player) {
		System.out.println("You have recieved a NASA Marshall's update!");
		int randomNum = random.nextInt(6);

		switch (randomNum) {
		// Stuart : need to add messages and player.setbalance +- amount
		case 0:
			System.out.println("Message " + randomNum);
			break;
		case 1:
			System.out.println("Message " + randomNum);
			break;
		case 2:
			System.out.println("Message " + randomNum);
			break;
		case 3:
			System.out.println("Message " + randomNum);
			break;
		case 4:
			System.out.println("Message " + randomNum);
			break;
		case 5:
			System.out.println("Message " + randomNum);
			break;
		default:
			;

		}

	}

	/**
	 * 
	 * @param player
	 * @param element
	 */
	public static void buyElement(Player player, Element element) {

		System.out.println("This element costs " + element.getRent());
		System.out.println("Are you sure you want to buy the element? Y/N");
		boolean wantsToBuy = getUserInput();
		if (wantsToBuy == true) {
			element.setOwner(player);
			player.setBalance(-element.getRent());
			System.out.println("Congratulations! You now own " + element.getElementName() + " part of the "
					+ element.getElementType() + " system");
			System.out.println("Your balance in now: " + player.getBalance());
		} else if (wantsToBuy == false) {
			// offer to group method
		}

	}

	/**
	 * 
	 * @param player
	 * @param element
	 */
	public static void offerElementToAll(Player player, Element element) {
		boolean elementPurchased = false;
		for (Player playerOffered : Game.players) {
			if (!player.getPlayerName().equalsIgnoreCase(playerOffered.getPlayerName()) && !elementPurchased) {
				System.out.println(playerOffered.getPlayerName() + ", would you like to buy " + element.getElementName() + "?");
				String wantsToBuy = scanner.next();
				if (wantsToBuy.equalsIgnoreCase("Y")) {
					buyElement(playerOffered, element);
					elementPurchased = true;
				}
			}
		}
		if (!elementPurchased) {
			System.out.println("No one decided to buy " + element.getElementName() + ".");
		}

	}
	
	// Handles various user inputs and returns a boolean value 
	// TODO: Jason - Write JavaDoc
	public static boolean getUserInput() {
		String userInput = scanner.next();
		if(userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("Yes")) {
			return true;
		} else if (userInput.equalsIgnoreCase("N") || userInput.equalsIgnoreCase("No")) {
			return false;
		} else {
			System.out.println("Unrecognised input.");
			getUserInput();
		}
		return false;
	}
	
	// Checks if the winning conditions have been met
	public static void checkWinConditions() {
		boolean allElementsDeveloped = false;
		// TODO: Loop through all the squares in the board and see if they have been developed.
		if(allElementsDeveloped == true) {
			winGame();
		}
	}
	
	// Prints the "Win Game" message and ends the game.
	public static void winGame() {
		// TODO: Write a better "Win Game" message.
		System.out.println("Congratulations team, you have successfully launched!");
		Game.gameOver = true;
	}
	

}