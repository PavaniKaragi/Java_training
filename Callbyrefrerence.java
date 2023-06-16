package Oops;

public class Callbyrefrerence {
	int x;

	public void addition(Callbyrefrerence a) {
		x = a.x + 5;
		System.out.println(x);
	}

	public static void main(String[] args) {

		Callbyrefrerence cr = new Callbyrefrerence();

		cr.x = 30;

		cr.addition(cr);

	}

}
