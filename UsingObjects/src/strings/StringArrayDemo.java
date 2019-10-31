package strings;

public class StringArrayDemo {
	public static void main(String[] args) {
		String[] fruit = new String[6];
		fruit[0] = "grape";
		fruit[1] = "apple";
		fruit[2] = "pear";
		fruit[3] = "Orange";
		fruit[4] = "mango";
		fruit[5] = "Pineapple";
		// String[] fruit = {"grape", "apple", "pear", "orange", "mango", "pineapple"}
		
		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i].toUpperCase());
		}
	
	}
	

	
	

}
