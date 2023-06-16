package Oops;

public class calculation {

	int x = 100, y = 200;

	// case 1- not giving parameters, no return output
	/*
	 * void sum() { System.out.println(x + y); }
	 */

	// case 2- not giving parameters, returns output
	/*
	 * int sum() { return (x + y); }
	 */

	// case3-taking params, not returns output

	void sum(int a, int b) {
		{
			System.out.println(a + b);
		}
	}

	public static void main(String[] args) {

		calculation cal = new calculation();
		// System.out.println(cal.sum());

		cal.sum(20, 30);

	}
}
