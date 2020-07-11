package com.kingsclasses.swapping;

import java.util.Scanner;

/**
 * @author Raja Bhaiya Vishwakarma 
 * Program to swap two numbers without using the third variable.
 */
class SwapTwoNumberWithoutThirdVariable {
	
	public static void main(String args[]) {

		// 1. Get the two numbers from user as a input (x and y).
		int x, y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers (x and y) : ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		System.out.println("Before Swapping : \n x = " + x + "\n y = " + y);
		scanner.close();

		// 2. Swap the numbers without using third variable.
		x = x + y;
		y = x - y; // (x + y) - y = x
		x = x - y; // (x + y) - x = y
		
		// 3. Print the numbers after swapping.
		System.out.println("After Swapping : \n x = " + x + "\n y = " + y);
	}
}