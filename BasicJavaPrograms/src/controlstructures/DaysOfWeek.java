package controlstructures;

public class DaysOfWeek {
	public static void main(String[] args) {
		int day = 5;

		switch (day){
			case 1: System.out.println("Monday");
			break;
			case 2: System.out.println("Tuesday");
			break;
			case 3: System.out.println("Wednesday");
			break;
			case 4: System.out.println("Thursday");
			break;
			case 5: System.out.println("Friday");
			break;
			case 6: System.out.println("Saturday");
			break;
			case 7: System.out.println("Sunday");
			break;
			default: System.out.println("Unknown Day");


		}

		switch (day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: System.out.println("Weekday"); break;
			case 6:
			case 7: System.out.println("Weekend"); break;
			default: System.out.println("Unknown Date"); break;
		}
	}
}