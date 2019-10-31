package main;
import lib.Name;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import lib.Name;
public class NameListDemo {

	public static void main(String[] args) {
		ArrayList<Name> register = new ArrayList<>();
		ArrayList<Name> register2 = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.println("provide first name " + i);
			String firstName = sc.nextLine();
			System.out.println("provide surname " + i);
			String surName = sc.nextLine();
			register.add(new Name(firstName, surName));
			
		}
		
		register.forEach(name -> System.out.println(name.getFullName().toLowerCase()));
		
		boolean exists = register.stream().anyMatch(name -> 
		name.getFamilyName().equals("Smith"));
		
		System.out.println(exists);
		
		register.stream().filter(name -> name.getFamilyName().length() > 10).forEach(name -> System.out.println(name.getFamilyName()));
		
		System.out.println(register.contains(new Name("Smith","Smith")));
	}

}
