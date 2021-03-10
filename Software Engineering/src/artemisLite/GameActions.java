/**
 * 
 */
package artemisLite;

import java.util.Random;

/**
 * @author stu_m
 *
 */
public class GameActions {
	
	public static int rollDice() {
		
		Random rand = new Random(); 
		
		return rand.nextInt(12)+1; 
	}

}

