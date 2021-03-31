/**
 * 
 */
package artemisLite;



/**
 * @author stu_m
 *
 */
public class Element extends Square {
	
	private ElementName elementName; 
	private ElementType elementType; 
	private Player owner; 
	private int rent;
	private int minorUpgrade;
	private int majorUpgrade;
	private int level;
	
	/**
	 * 
	 * Default
	 */
	public Element() {
		
	}
	
	/**
	 * 
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
	 * @return the elementType
	 */
	public ElementType getElementType() {
		return elementType;
	}
	/**
	 * @param elementType the elementType to set
	 */
	public void setElementType(ElementType elementType) {
		this.elementType = elementType;
	}
	/**
	 * @return the owner
	 */
	public Player getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
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
	
	

}