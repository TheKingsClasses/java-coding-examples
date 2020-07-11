package com.kingsclasses;

import java.util.Scanner;

/**
 * @author Raja Bhaiya Vishwakarma 
 * Java program to determine whether the number is Armstrong number or not.
 */
public class CheckArmstrongNumberProgram1 {
	public static void main(String args[]) {

		// 1. Get the number from user.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any Positive Number : ");
		int number = scanner.nextInt();
		scanner.close();

		// 2. Logic for Armstrong number.
		int temp = number;
		int result = 0;
		while (temp != 0) {
			int rem = temp % 10;
			result = result + rem * rem * rem;
			temp = temp / 10;
		}

		// 3. Print the result.
		if (result == number) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}
}
