/**
 * 
 */
package artemisLite;

/**
 * @author stu_m
 *
 */
public class Player {
	private String playerName; 
	private int position; 
	private int balance; 
	private boolean bankrupt;
	
	
	
	
	
	
	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
				
		this.position = (this.position+position)%12; ;
	}
	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	/**
	 * @return the bankrupt
	 */
	public boolean isBankrupt() {
		return bankrupt;
	}
	/**
	 * @param bankrupt the bankrupt to set
	 */
	public void setBankrupt(boolean bankrupt) {
		this.bankrupt = bankrupt;
	} 
	
	
	
}