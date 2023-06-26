package Oops;

public class Staticexample {

	static int a = 10; // static variable
	int b = 20; // non static variable

	static void m1() {
		System.out.println("this is static method");
	}

	void m2() // Non static method
	{
		System.out.println("this is non static method");
	}

	void m3()

	{
		System.out.println(a);
		System.out.println(b);
		m1();// static
		m2();// non static

	}

	public static void main(String[] args) {

		// static method only access the static stuff(variables and methods)

		System.out.println(a);
		m1();

		// System.out.println(b); //throws error because of non static stuff
		// m1();

		Staticexample se = new Staticexample();
		System.out.println(se.b);
		se.m2();
		se.m3();

	}

}
