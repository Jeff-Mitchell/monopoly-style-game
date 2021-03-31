/**
 * 
 */
package artemisLite;

/**
 * @author Stuart McCann
 * @author Jeff Mitchell
 *
 */
public class Player {

	private final int STARTING_FUNDS = 2000;
	private String playerName;
	private int position;
	private int balance;
	private boolean bankrupt;
	private boolean passGo;

	/**
	 * Default
	 */
	public Player() {

	}

	public Player(String playerName) {
		this.playerName = playerName;
		this.position = 0;
		this.balance = STARTING_FUNDS;
		bankrupt = false;
	}

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
		if (this.position + position >= Board.NUM_SQUARES) {
			this.setPassGo(true);
		}
		this.position = (this.position + position) % Board.NUM_SQUARES;

	}

	/**
	 * 
	 * @return
	 */
	public boolean isPassGo() {
		return passGo;
	}

	/**
	 * 
	 * @param passGo
	 */
	public void setPassGo(boolean passGo) {
		this.passGo = passGo;
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

		this.balance += balance;
		
		if (this.balance <= 0) {
			this.setBankrupt(true);
		}
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

		if (bankrupt) {
			Game.gameOver = true;
		}

		System.out.println(this.playerName + " you've gone bankrupt!");

	}

	/**
	 * to string method which prints player stats
	 */
	public void printAll() {
		System.out.println("\n|--------------------------------" + "\n|Player Name        = " + this.playerName + ""
				+ "\n|Player Position    = " + this.position + "" + "\n|Player Balance     = " + this.balance + ""
				+ "\n|Bankrupt?          = " + this.bankrupt + "" + "\n|--------------------------------");
	}

	public void chargeRent(int rent) {
		this.balance -= rent;
	}
}