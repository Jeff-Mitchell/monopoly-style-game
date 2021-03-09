package softwareEngineering;

import java.util.Random;

public class Dice {

	/**
	 * vars
	 */
	private int sidesN;
	private Random num;

	/**
	 * constructor to create a 6 sided dice object
	 */
	public Dice() {
		sidesN = 6;
		num = new Random();
	}

	/**
	 * constructor to create an n sided dice object
	 */
	public Dice(int n) {
		sidesN = n;
		num = new Random();
	}

	/**
	 * getter for number of sides of dice
	 */
	public int getNumSides() {
		return sidesN;
	}

	/**
	 * setter for number of sides of dice
	 */
	public void setNumSides(int n) {
		sidesN = n;
	}

	/**
	 * rolls the dice and returns number rolled
	 */
	public int nextRoll() {
		return num.nextInt(sidesN) + 1;
	}

	/**
	 * returns number of sides of the dice (toString method)
	 */
	public String toString() {
		return "Number of Sides" + sidesN;
	}
}