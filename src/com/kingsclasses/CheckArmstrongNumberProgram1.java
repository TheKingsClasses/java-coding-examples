package com.kingsclasses;

import java.util.Scanner;

public class CheckArmstrongNumberProgram1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any Positive Number : ");
		int number = scanner.nextInt();
		scanner.close();

		int temp = number;
		int result = 0;
		while (temp != 0) {
			int rem = temp % 10;
			result = result + rem * rem * rem;
			temp = temp / 10;
		}

		if (result == number) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}
}
