package lib;

import java.util.ArrayList;

public class RegisterY extends Register {
	
	public RegisterY() {
		super();
	}
	
	public Name getName(int index) {
		Name name = super.getName(index);
		name.setFirstName(name.getFirstName().toUpperCase());
		name.setFamilyName(name.getFamilyName().toUpperCase());
		return name;
	}
}
