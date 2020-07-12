package com.kingsclasses.armstrong;

import java.util.Scanner;

/**
 * @author Raja Bhaiya Vishwakarma 
 * Java program to check whether the n-digit number is an Armstrong number or not.
 */
public class CheckArmstrongNumberProgram2 {

	public static void main(String[] args) {
		
		// 1. Get the n-digit number as input from user.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any positive number : ");
		int number = scanner.nextInt();
		scanner.close();
		
		// 2. Calculate the summation of input number digits by Armstrong number logic.
		int sum = calculateSummation(number);
		
		// 3. Compare the input number with summation.
		if (number == sum) {
			// 4. If input number and summation is equal display “Number is an Armstrong number”.
			System.out.println(number + " is an Armstrong number.");
		} else {
			// 5. Else display “Number is not an Armstrong number”.
			System.out.println(number + " is not an Armstrong number.");
		}
	}

	/*
	 * Method to calculate x raised to the power n.
	 */
	public static int power(int x, long n) {
		if (n == 0)
			return 1;
		if (n % 2 == 0)
			return power(x, n / 2) * power(x, n / 2);
		return x * power(x, n / 2) * power(x, n / 2);
	}

	/* 
	 * Method to calculate number of digits in the number.
	 */
	public static int getNumberOfDigits(int number) {
		int numberOfDigits = 0;
		while (number != 0) {
			numberOfDigits++;
			number = number / 10;
		}
		return numberOfDigits;
	}

	/* 
	 * Method to calculate the summation of input number's digits by Armstrong number logic. 
	 */
	public static int calculateSummation(int number) {
		// Calling getNumberOfDigits method to get the number of digits.
		int numberOfDigits = getNumberOfDigits(number);
		int sum = 0, temp = number;
		while (temp != 0) {
			int reminder = temp % 10;
			sum = sum + power(reminder, numberOfDigits);
			temp = temp / 10;
		}
		return sum;
	}
}
