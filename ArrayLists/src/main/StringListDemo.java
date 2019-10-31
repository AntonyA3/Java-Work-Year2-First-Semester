package main;

import java.util.ArrayList;
public class StringListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Money");
		list.add("Stuff");
		list.add("Bar");
		list.add("foo");
		
		System.out.println(list.toString());
		list.set(3, "rtn");
		
		System.out.println(list.toString());
		
		for (String x: list) {
			System.out.println(x.toUpperCase() );
		}
		
		list.forEach(x -> System.out.println(x.toLowerCase()));
		
	}

}
