package main;

import lib.Name;
import lib.Register;

public class RegisterApp {


	public static String execute(Register reg, Name n) {	
		reg.removeName(1);
		reg.addName(n);
		String namesInLine = "";
		for (Name name: reg) {
			if (name.getFamilyName().length() >= 5) {
				namesInLine +=name.getFamilyName().toUpperCase()+ ", " + name.getFirstName().charAt(0)+ "\n";
			
			}
		}
		return namesInLine;
	
	}
	

}