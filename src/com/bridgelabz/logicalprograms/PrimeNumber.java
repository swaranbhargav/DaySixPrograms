package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.print("Enter a number to check if it is prime: ");
		int number = Number.nextInt();
		Number.close();
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;

			}

		}
		if (count == 2) {

			System.out.println("The number is  prime number ");

		} else {
			System.out.println("The number is not a prime number");
		}

	}

}
