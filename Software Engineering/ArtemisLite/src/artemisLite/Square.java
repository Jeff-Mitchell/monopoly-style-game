/**
 * 
 */
package artemisLite;



/**
 * @author stu_m
 *
 */
public class Square {
	
	private SquareType squareType; 
	int squareNumber;
	
	/**
	 * Default constructor 
	 */
	public Square() {
		
	}
	
	/**
	 * Constructor with args 
	 * @param squareType
	 * @param squareNumber
	 */
	public Square(SquareType squareType, int squareNumber) {
		this.squareType= squareType; 
		this.squareNumber= squareNumber; 
	}
	
	
	/**
	 * @return the squareType
	 */
	public SquareType getSquareType() {
		return squareType;
	}
	/**
	 * @param squareType the squareType to set
	 */
	public void setSquareType(SquareType squareType) {
		this.squareType = squareType;
	}
	/**
	 * @return the squareNumber
	 */
	public int getSquareNumber() {
		return squareNumber;
	}
	/**
	 * @param squareNumber the squareNumber to set
	 */
	public void setSquareNumber(int squareNumber) {
		this.squareNumber = squareNumber;
	} 

}

