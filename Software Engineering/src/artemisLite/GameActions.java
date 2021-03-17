/**
 * 
 */
package artemisLite;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author stu_m
 *
 */

// A utility class which sets the number and names of players and allows for player movement
public class GameActions {

	public static ArrayList<Player> setPlayers(Scanner scan) {

		ArrayList<Player> players = new ArrayList<>();
		int numPlayers;
		System.out.println("Welcome to Artemis Lite - Please enter the number of players between 2 and 4");

		do {
			numPlayers = scan.nextInt();
			if (numPlayers < 2 || numPlayers > 4) {
				System.out.println("Invalid number of players - please enter a number between 2 and 4!");
			} else {
				for (int loop = 1; loop <= numPlayers; loop++) {
					System.out.println("Please enter player " + loop + "'s name");
					String playerName = scan.next();

					Player player = new Player(playerName);
					players.add(player);
					System.out.println("Player added");

				}
			}
		} while (numPlayers < 2 || numPlayers > 4);

		return players;

	}

	public static int rollDice() {

		Random rand = new Random();

		return rand.nextInt(12) + 1;
	}

}
