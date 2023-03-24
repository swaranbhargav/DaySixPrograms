package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.println("Enter the number You want to Reverse :");
		int n = Number.nextInt();
		Number.close();
		int rem;
		int rev = 0;
		while (n > 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;

		}
		System.out.println("The reverse of the number n is :" + rev);

	}

}
