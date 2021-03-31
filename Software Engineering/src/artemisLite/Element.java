/**
 * 
 */
package artemisLite;



/**
 * @author stu_m
 *
 */
public class Element extends Square {
	
	// Sets instance variables
	private ElementName elementName; 
	private ElementType elementType; 
	private Player owner; 
<<<<<<< HEAD
	private boolean minorDevelopment;
	private boolean majorDevelopment; 
=======
>>>>>>> e632c358f32ba9842c8ddbbb84ddba62e58bd4a3
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
	 * @param squareNumber
	 * @param elementName
	 * @param elementType
	 * @param rent
	 */
	public Element( int squareNumber, ElementName elementName, ElementType elementType, int rent) {
		super(SquareType.SYSTEM, squareNumber); 
		this.elementName=elementName; 
		this.elementType= elementType; 
		this.rent= rent; 
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
	 * @return the elementType
	 */
	public ElementType getElementType() {
		return elementType;
	}
	/**
	 * Sets the type of the element
	 * @param elementType the elementType to set
	 */
	public void setElementType(ElementType elementType) {
		this.elementType = elementType;
	}
	/**
	 * Gets the owner of the element
	 * @return the owner of the element
	 */
	public Player getOwner() {
		return owner;
	}
	/**
	 * Sets the owner of the element
	 * @param owner the owner of the element
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
	}
	
	/**
<<<<<<< HEAD
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
=======
>>>>>>> e632c358f32ba9842c8ddbbb84ddba62e58bd4a3
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
	
	

}