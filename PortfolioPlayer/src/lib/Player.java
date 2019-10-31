package lib;


/** 
 * A Player has a name and has a pair of dice.
 * A player can roll it's dice and retrieve a score.
 * 
 * 
 * The player class is composed of a Name and a PairOfDice
 * 
 * @author p17150942
 */
public class Player implements Comparable<Player> {
	private Name name;
	private Rollable dice;
	
	
	/** Default constructor that creates a player with a default Name
	 * and a default pairOfDice 
	 */
	public Player() {
		name = new Name();
		dice = new PairOfDice();
	}
	
	/** Name only constructor that creates a player with a given Name
	 * and a default pairOfDice.
	 * 
	 * @param The name of the player
	 */
	public Player(Name name) {
		this.name = name;
		dice = new PairOfDice();
		
	}
	/** The custom constructor that creates a player with a given Name
	 * and a given rollable.
	 * 
	 * @param name The name the player will have
	 * @param The member of Rollable the player will have
	 */
	public Player(Name name, Rollable dice) {
		this.name = name;
		this.dice = dice;
		
	}
	
	
	/** Returns the current dice the player holds
	 * 
	 * @return The dice the player holds
	 */
	public Rollable getRollable() {
		return dice;
	}

	/**
	 * Returns the current name of the player
	 * @return the current name of the player
	 */
	public Name getName() {
		return name;
	}
	
	/**
	 * Assigns a new name to this player.
	 * @param name the name to be assigned to the player.
	 */
	public void setName(Name name) {
		this.name = name;
	}
	

	/**
	 * Assigns a new rollable to this player.
	 * @param dice the rollable to be assigned to this player.
	 */
	public void setRollable(Rollable dice) {
		this.dice = dice;
	}
	
	/** Calls the roll method of the rollable
	 */
	public void rollDice() {
		dice.roll();
	}
	
	/**Returns the dice score within the rollable
	 * 
	 * @return the score from the pairOfDice
	 */
	public int getDiceScore() {
		return dice.getScore();
	}
	
	/**This sets the first name and the family name of the current name.
	 * 
	 * @param fullName the full name as a string 
	 */
	public void setFullPlayerName(String fullName) {
		name.setFirstName(fullName.substring(0, fullName.indexOf(" ")));
		name.setFamilyName(fullName.substring(fullName.indexOf(" ")+ 1));
	}
	
	/** This will compare the player with a given object,
	 * this will return true if the object is the same class is not null
	 * and has matching fields.
	 * 
	 * @param obj the given object that is being compared against the player
	 * 
	 * @return true if the given object is a Player and has equivalent attributes to the current player,
	 * false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Player object = (Player) obj;
		
		return name.equals(object.name) && dice.equals(object.dice);
	}
	
	/** Returns a textual representation of the state of the player. 
	 * 
	 * @return a textual representation of the state of the player.
	 */
	@Override
	public String toString() {
		return "Player:[name: " + name.toString() +
				", pairOfDice: " + dice.toString() + 
				"]";
	}
	
	/** Compares the Player by comparing it's name
	 * 
	 * @param The player to compare to this player
	 * 
	 * @return -1 if the Player is less than this player, 0 
	 * if the Player is equal to that player, 1 If the player is greater than
	 * this player.
	 */
	@Override
	public int compareTo(Player other) {
		int result = this.name.compareTo(other.name);
		return result;
	}

}
