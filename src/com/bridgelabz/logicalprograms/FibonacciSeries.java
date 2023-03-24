package com.bridgelabz.logicalprograms;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.print("Enter the number of terms in the Fibonacci series: ");
		int number = Number.nextInt();
		Number.close();
		int firstNumber = 0;
		int secondNumber = 0;
		int nextNumber;
		for (int i = 0; i <= number; i++) {
			System.out.println("The fibpnacci Series of the Number is :");
			nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			return;

		}

	}
}
