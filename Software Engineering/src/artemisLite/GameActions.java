/**
 * 
 */
package artemisLite;

import java.util.Random;
import java.util.Scanner;

/**
 * @author stu_m
 *
 */
public class GameActions {
	
	public static int rollDice() {
		
		Random rand = new Random(); 
		
		return rand.nextInt(12)+1; 
	}
	
	public static String enterName() {
		
		
		String playerName;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name");
		playerName=scanner.nextLine();
		System.out.println("Welcome "+playerName);
		scanner.close();
		return playerName;
		
	} 

}

