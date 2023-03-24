package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatech {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Press Enter to start the stopwatch.");
		scanner.nextLine();
		scanner.close();

		long startTime = System.currentTimeMillis();

		System.out.println("Press Enter again to stop the stopwatch.");
		scanner.nextLine();

		long endTime = System.currentTimeMillis();

		long totalTime = endTime - startTime;

		System.out.println("Elapsed time: " + totalTime + "milliseconds");

	}

}
