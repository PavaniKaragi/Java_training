package javatraining;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X and y");

		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before swapping" + x + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println("After swapping" + x + y);
		System.out.println();
	}

}
