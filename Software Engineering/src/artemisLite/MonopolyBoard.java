/**
 * 
 */
package artemisLite;

import java.util.ArrayList;

public class MonopolyBoard {

	public static void main(String[] args) {
		
		ArrayList<Square> board = new ArrayList<>(12); 
		
		Player player1 = new Player(); 
		
		for(int loop = 0; loop<19; loop++) {
		player1.setPosition(GameActions.rollDice());
		System.out.println(player1.getPosition());
		}

	}
}
