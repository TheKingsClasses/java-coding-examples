package com.kingsclasses;

import java.util.Scanner;

/**
 * @author Raja Bhaiya Vishwakarma 
 * Java program to determine whether the number is Armstrong number or not.
 */
public class CheckArmstrongNumberProgram2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any Positive Number : ");
		int number = scanner.nextInt();
		scanner.close();
		boolean isArmstrong = isArmstrong(number);
		if (isArmstrong)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}

	/*
	 * Method to calculate x raised to the power n
	 */
	public static int power(int x, long n) {
		if (n == 0)
			return 1;
		if (n % 2 == 0)
			return power(x, n / 2) * power(x, n / 2);
		return x * power(x, n / 2) * power(x, n / 2);
	}

	/* Method to calculate number of digits in the number */
	public static int getNumberOfDigits(int number) {
		int numberOfDigits = 0;
		while (number != 0) {
			numberOfDigits++;
			number = number / 10;
		}
		return numberOfDigits;
	}

	// Method to check whether the given number is Armstrong number or not
	public static boolean isArmstrong(int number) {
		// Calling getNumberOfDigits method to get the number of digits.
		int numberOfDigits = getNumberOfDigits(number);
		int temp = number, sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + power(r, numberOfDigits);
			temp = temp / 10;
		}

		// If satisfies Armstrong condition
		return (sum == number);
	}
}
