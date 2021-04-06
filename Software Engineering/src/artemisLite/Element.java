package artemisLite;

/**
 * @author Stuart McCann
 * @author Jason McKillen
 * @author Mark Davidson
 * @author Jeff Mitchell
 * @see ElementName.java, ElementType.java, Square.java
 * 
 * TODO: JavaDoc code.
 *
 */
public class Element extends Square {

	// Sets instance variables
	private ElementName elementName;
	private ElementType elementType;
	private Player owner;
	private boolean minorDevelopment;
	private boolean majorDevelopment;
	private int rent;
	private int minorUpgrade;
	private int majorUpgrade;
	private int level;

	/**
	 * 
	 * Default constructor for the element class
	 */
	public Element() {

	}

	/**
	 * Constructor with args for the element class
	 * 
	 * @param squareNumber
	 * @param elementName
	 * @param elementType
	 * @param rent
	 */
	public Element(int squareNumber, ElementName elementName, ElementType elementType, int rent) {
		super(SquareType.SYSTEM, squareNumber);
		this.elementName = elementName;
		this.elementType = elementType;
		this.rent = rent;
	}

	/**
	 * @return the elementName
	 */
	public ElementName getElementName() {
		return elementName;
	}

	/**
	 * @param elementName the elementName to set
	 */
	public void setElementName(ElementName elementName) {
		this.elementName = elementName;
	}

	/**
	 * Gets the type of the element
	 * 
	 * @return the elementType
	 */
	public ElementType getElementType() {
		return elementType;
	}

	/**
	 * Sets the type of the element
	 * 
	 * @param elementType the elementType to set
	 */
	public void setElementType(ElementType elementType) {
		this.elementType = elementType;
	}

	/**
	 * Gets the owner of the element
	 * 
	 * @return the owner of the element
	 */
	public Player getOwner() {
		return owner;
	}

	/**
	 * Sets the owner of the element
	 * 
	 * @param owner the owner of the element
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
	}

	/**
	 * @return the majorDevelopment
	 */
	public boolean isMinorDevelopment() {
		return minorDevelopment;
	}

	/**
	 * @param minorDevelopment the minorDevelopment to set
	 */
	public void setMinorDevelopment(boolean minorDevelopment) {
		this.minorDevelopment = minorDevelopment;
	}

	/**
	 * @return the majorDevelopment
	 */
	public boolean isMajorDevelopment() {
		return majorDevelopment;
	}

	/**
	 * @param majorDevelopment the majorDevelopment to set
	 */
	public void setMajorDevelopment(boolean majorDevelopment) {
		this.majorDevelopment = majorDevelopment;
	}

	/**
	 * @return the rent
	 */
	public int getRent() {
		return rent;
	}

	/**
	 * @param rent the rent to set
	 */
	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getMajorUpgrade() {
		return majorUpgrade;
	}

	public void setMajorUpgrade(int majorUpgrade) {
		this.majorUpgrade = majorUpgrade;
	}

	public int getMinorUpgrade() {
		return minorUpgrade;
	}

	public void setMinorUpgrade(int minorUpgrade) {
		this.minorUpgrade = minorUpgrade;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	/**
	 * Shows details of all elements to screen
	 */
	public void showElementDetails() {
		GameActions.drawLine();
		System.out.println(this.elementName+": "+this.elementType);
		if(this.owner!=null) {
		System.out.println("Owned by: "+this.owner.getPlayerName());
		}else {
			System.out.println("Not currently owned");
		}
		System.out.println("Minor upgrades: "+this.minorUpgrade);
		System.out.println("Major upgrades: "+this.majorUpgrade);
		System.out.println();
		
	}

}