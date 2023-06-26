package Oops;

public class Methodoverloading {

	int x, y;
	double z;

	int addition()// 1
	{
		x = 10;
		y = 20;
		return (x + y);
	}

	int addition(int a, int b)// 2
	{
		x = a;
		y = b;
		return (x + y);
	}

	double addition(int a, double b)// 3
	{
		x = a;
		z = b;
		return (x + y);
	}

	void main() {
		System.out.println("This is main method....");
	}

	public static void main(String[] args) {

		Methodoverloading m = new Methodoverloading();
		System.out.println(m.addition());// 1
		System.out.println(m.addition(100, 200));// 2
		System.out.println(m.addition(200, 10.5));// 3

		m.main();// call main method
	}

}
