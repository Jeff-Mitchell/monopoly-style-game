/**
 * 
 */
package artemisLite;



/**
 * @author stu_m
 *
 */
public class Go extends Square {
	
	private static final int GO_FUNDING = 200;  
	
	/**
	 * 
	 */
	public Go() {
		
	}
	
	public Go(int squareNumber) {
		super(SquareType.GO, squareNumber); 
	}
	
	public void addFunding(Player player) {
		player.setBalance(GO_FUNDING);
	}


}
