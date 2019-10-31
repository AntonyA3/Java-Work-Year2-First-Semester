package main;

import lib.measurable.Song;
import lib.measurable.DataAnalysis;
import lib.measurable.Die;
import lib.measurable.Name;

public class MeasurableDemo {

	public static void main(String[] args) {
		DataAnalysis<Song> songAnalysis = new DataAnalysis<Song>();
		DataAnalysis<Die> diceAnalysis = new DataAnalysis<Die>();
		DataAnalysis<Name> nameAnalysis = new DataAnalysis<Name>();
		
		diceAnalysis.addMeasurable(new Die(10));
		diceAnalysis.addMeasurable(new Die(5));
		diceAnalysis.addMeasurable(new Die(6));
		diceAnalysis.addMeasurable(new Die(100));
		System.out.println(diceAnalysis.min());
		
		
		
	}

}
