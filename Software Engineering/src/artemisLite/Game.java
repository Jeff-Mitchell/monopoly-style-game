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
		
		
		
		//print player stats
		System.out.println(players.toString());



	}
}
