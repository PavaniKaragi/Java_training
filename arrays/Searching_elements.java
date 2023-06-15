package javatraining;

public class Searching_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 100, 50, 80 };

		int num = 70;
		boolean flag = false;

		for (int i : a) 
		{
			if (i == num)
			{
				System.out.println("element found");
				flag = true;
				break;
			}

		}
		if (flag == false)
		{
			System.out.println("element not found");
		}
	}
}