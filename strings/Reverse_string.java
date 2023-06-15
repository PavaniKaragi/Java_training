package javatraining;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "selenium";

		int len = s.length();// 8

		String rev = "";

		for (int i = len - 1; i >= 0; i--) // 7 6 5 4 3 2 1
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("reverse string:" + rev);

	}

}
