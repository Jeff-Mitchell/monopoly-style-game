/**
 * 
 */
package artemisLite;

import java.util.Random;

/**
 * @author stu_m
 *
 */
/**
 * @author stu_m
 *
 */
public class Chance extends Square {

	protected static final int chanceIncrease = 250;
	protected static final int chanceDeduct = -250;

	/**
	 * Default
	 */
	public Chance() {

	}

	public Chance(int squareNumber) {
		super(SquareType.CHANCE, squareNumber);
	}

	public void chanceOutcome() {

		Random random = new Random();
		int randomNumber;

		randomNumber = random.nextInt(5);
		randomNumber = randomNumber + 1;

		switch (randomNumber) {
		case 1:
			System.out.println("The President has increased your project funding by 250");
			
			break;
		case 2:
			System.out.println("Lead engineer is ill, hire a replacement, pay 250 for a replacement");

			break;
		case 3:
			System.out.println("Foreign actors have hacked the network. Pay 250 to repair!");

			break;
		case 4:
			System.out.println("You have received a donation of 250 from a mystery billionaire!");

			break;
		case 5:
			System.out.println("The president has decreased funding by 250");

			break;
		case 6:
			System.out.println("Russia have made a breakthrough! Funding increased by 250");

		}
	}
	
	public void addFunding(Player player) {
		player.setBalance(chanceIncrease);
	}
	
	public void subtractFunding(Player player) {
		player.setBalance(chanceDeduct);
	}
	
	
	
	
	
}