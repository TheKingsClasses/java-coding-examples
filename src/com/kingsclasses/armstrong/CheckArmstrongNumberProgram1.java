package com.kingsclasses.armstrong;

import java.util.Scanner;

/**
 * @author Raja Bhaiya Vishwakarma 
 * Java program to check whether the number is an Armstrong number or not.
 */
public class CheckArmstrongNumberProgram1 {

	public static void main(String args[]) {

		// 1. Get the number as input from user.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any 3-digit positive number : ");
		int number = scanner.nextInt();
		scanner.close();
		
		// 2. Calculate the summation of input number's digits by Armstrong number logic.
		int sum = 0, temp = number;
		while (temp != 0) {
			int reminder = temp % 10;
			sum = sum + (reminder * reminder * reminder);
			temp = temp / 10;
		}
		
		// 3. Compare the input number with summation.
		if (number == sum) {
			// 4. If input number and summation is equal display “Number is an Armstrong number”.
			System.out.println(number + " is an Armstrong number.");
		} else {
			// 5. Else display “Number is not an Armstrong number”.
			System.out.println(number + " is not an Armstrong number.");
		}
	}
}
