/**
 * 
 */
package artemisLite;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	private static final int NUM_SQUARES = 12;
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		 
		ArrayList<Square> board =  Board.createBoard(); 
	
		// ask for num players 
		ArrayList<Player> players =  GameActions.setPlayers(scan); 
		//roll 
		
		// game conditions 
		
		
		
		//print each player 1s stats
		System.out.println(players.get(0).toString());

	
		//scanner to ask look at next player stats?
		// create loop to continue printing all players that exists stats.
		System.out.println("Continue to next players stats?");

	}
}
