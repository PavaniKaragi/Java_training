package javatraining;

public class operators {

	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		// arithmetic operators (+,-,*,/,%)

		System.out.println("sum of a and b is:" + (a + b));
		System.out.println("diff of a and b is:" + (a - b));
		System.out.println("mul of a and b is:" + (a * b));
		System.out.println("Div of a and b is:" + (a / b));
		System.out.println("Mod of a and b is:" + (a % b));

		// Relational operators/comparison operators
		// > >= < <= != ==
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);

		// Logical operators && || ! -- returns true/false

		boolean x = true;
		boolean y = false;

		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);

		// increment & decrement
		a = 100;
		b = 90;

		System.out.println(a++); // post increment
		System.out.println(a);
		System.out.println(b--);// post decrement
		System.out.println(b);
		System.out.println(--a);// pre decrement
		System.out.println(a);
		System.out.println(++a);// pre increment
		System.out.println(a);
	}

}
