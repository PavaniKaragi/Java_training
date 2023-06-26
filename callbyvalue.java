package Oops;

public class callbyvalue {

	int x;

	public void addition(int a) {
		x = a + 5;
		// System.out.println(x);

	}

	public static void main(String[] args) {

		callbyvalue cv = new callbyvalue();

		cv.addition(10);

		System.out.println(cv.x);

	}

}
