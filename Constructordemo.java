package Oops;

public class Constructordemo {

	int x, y;

	Constructordemo() // default constructor(no parameters)
	{
		x = 100;
		y = 400;

		System.out.println(x + y);
	}

	Constructordemo(int a, int b)// parameterized constructor
	{
		x = a;
		y = b;
		System.out.println(x + y);

	}

	public static void main(String[] args) {
		Constructordemo c = new Constructordemo(20, 30);
	}

}
