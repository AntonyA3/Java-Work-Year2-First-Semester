package main;

import lib.Name;
import lib.Die;
import lib.PairOfDice;
import lib.Player;
public class PlayerApp {

	public static void main(String[] args) {
		Player player = new Player(new Name("Joe","Bloggs"), new PairOfDice(new Die(6),new Die(6)));
		System.out.println(player.toString());
		
		player.setFullPlayerName("Bar Foo");
		System.out.println(player.toString());

	}

}
