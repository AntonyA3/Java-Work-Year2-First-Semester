package main;


import lib.polymorphism.*;
public class IterableDemo {

	public static void main(String[] args) {
		MultipleDice dice = new MultipleDice(5);
		
		/*for (Die die: dice) {
			System.out.println(die.toString());
		} */
		
		dice.forEach(die -> System.out.println(die.toString()));
		

	}

}
