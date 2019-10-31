package lib;

/**
 * 
 * A pair of dice is a composition of two Die instances.
 * 
 * @author la
 */

public class PairOfDice implements Rollable {
	
	//Fields
	private Die red;
	private Die blue;
	
	
	//Constructors
	/** The default constructor for a Pair of Dice
	 * The pair of dice a red dice and a blue dice which are both default dice
	 * 
	 */
	public PairOfDice() {
		red = new Die();
		blue = new Die();
	}
	
	/** The custom constructor for a pair of dice
	 * 
	 * @param red The red dice for this pair of dice
	 * @param blue The blue dice for this pair of dice
	 */
	public PairOfDice(Die red, Die blue) {
		this.red = red;
		this.blue = blue;
	}
	
	
	//Methods
	
	@Override
	/** This will roll the red dice and the blue dice
	 * 
	 */
	public void roll() {
		red.roll();
		blue.roll();
	}
	
	@Override
	/** Will get the score of the red dice and the blue dice and add them together
	 * 
	 * @return The addition of the score of the red dice and the blue dice score.
	 */
	public int getScore() {
		return red.getScore() + blue.getScore();
	}
	
	/** Returns the red dice
	 * 
	 * @return the red dice
	 */
	public Die getRed() {
		return red;
	}
	
	/** Returns the blue dice
	 * 
	 * @return the blue dice
	 */
	public Die getBlue() {
		return blue;
	}
	
	@Override
	/** Returns a textual representation of this pair of dice
	 * 
	 * @return A textual representation of the pair of dice
	 */
	public String toString() {
		return "PairOfDice:[red=" + red + ", blue=" + blue + "]";
	}
	
	@Override
	/** Compares an object to the current name.
	 * Will return if the class is equal, and the fields are equal to each other
	 * otherwise it will return false.
	 * 
	 * @param obj the object to be compared to this name 
	 * 
	 * @return True if the object is equal to this name, false otherwise
	 */
	public boolean equals(Object obj) {
		// test exceptional cases, i.e. obj not null and is a Die
		if (obj == null  || this.getClass() != obj.getClass())
			return false;

		PairOfDice other = (PairOfDice) obj; // downcast to a PairOfDice object

		//a PairOfDice is equal if both the red and blue Die are equal
		return this.blue.equals(other.blue) && this.red.equals(other.red);
	}

}
