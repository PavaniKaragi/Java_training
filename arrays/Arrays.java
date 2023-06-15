package javatraining;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a[]=new int[5]; //declaration
		 * 
		 * //inserting values a[0]=100; a[1]=200; a[2]=300; a[3]=400; a[4]=500;
		 */ // static array

		int a[] = { 100, 200, 300, 400, 500 }; // dynamic array

		System.out.println(a.length); // size of an array

		System.out.println(a[2]); // extracts specific values from array

		for (int i = 0; i <= a.length - 1; i++)

		{
			System.out.println(a[i]);
		}

		for (int i : a) {
			System.out.println(i);
		}

	}

}
