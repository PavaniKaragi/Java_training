package javatraining;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// length
		String s = "welcome";
		int len = s.length();
		System.out.println(len);

		// concat
		String s1 = "welcome";
		String s2 = "Effigo";
		System.out.println(s1 + " " + s2);

		System.out.println(s1.concat(s2));
		System.out.println("Hii".concat("Pavani"));

		// trim
		s = "  Java programming   ";
		System.out.println(s.trim());

	}
}
