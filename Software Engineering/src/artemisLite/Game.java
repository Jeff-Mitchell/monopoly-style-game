/**
 * 
 */
package artemisLite;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	private static final int NUM_SQUARES = 12;
	
	// JASON: I've added gameOver as a condition which will exit the game and can be triggered in various circumstances (e.g. bankruptcy, victory, user quitting).
	private static boolean gameOver = false;
	
	public static ArrayList<Player> players = new ArrayList<Player>();
	
	// Instantiates the scanner class to allow user input.
	Scanner scanner = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		ArrayList<Square> board =  Board.createBoard(); 
		System.out.println("Welcome to Artemis Lite");
		
		// JASON: I'd like to add a "Show rules" method here, which would ask the user if they want to see the rules of the game.
		
		GameActions.setNumberOfPlayers();
		GameActions.showAllPlayerStats();
		
		//JEFF: Added beginnings of show rules code.
		GameActions.showRules();
		
		
		
		//roll 
		GameActions.rollDice();
		
		
		// game conditions 
		
		
		
		//print each player 1s stats
		//System.out.println(players.get(0).toString());

	
		//scanner to ask look at next player stats?
		// create loop to continue printing all players that exists stats.
		// System.out.println("Continue to next players stats?");

	}
}
