package strings;

public class Initials {
	public static void main(String[] args) {
		String name = "David Beckham";
		String initials = "" +name.charAt(0) + name.charAt(name.indexOf(" ") + 1);
				
		System.out.println("David Beckham's initials are: " + initials);
		System.out.println("David Beckham's email address is: " + initials.toLowerCase() + "@email.dmu.ac.uk");
	}

}
