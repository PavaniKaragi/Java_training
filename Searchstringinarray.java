package javatraining;

public class Searchstringinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[] = { "welcome", "python", "java", "selenium" };
		String searchstring = "selenium";

		boolean flag = false;

		for (String i : s) {
			if (i.equals(searchstring)) {
				System.out.println("string found in array");
				flag = true;
				break;
			}
		}
		if (flag = false) {
			System.out.println("string not found in array");
		}
	}

}
