package javatraining;

public class sum_of_nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40, 50 };

		int sum = 0;

		for (int i : a) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
