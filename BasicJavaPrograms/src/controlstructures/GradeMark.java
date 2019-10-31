package controlstructures;

public class GradeMark {
	public static void main(String[] args) {
		int mark = 43;

		if (mark<40) {
			System.out.println("Fail");
		}
		else if (mark<=59) {
			System.out.println("Pass");
		}
		
		else if (mark <=69){
			System.out.println("Merit");
		}
		else {
			System.out.println("Distinction");
		}
	}

}
