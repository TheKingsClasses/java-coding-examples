package com.kingsclasses.palindrome;

import java.util.Scanner;

/**
 * @author Raja Bhaiya Vishwakarma 
 * Program to check whether a given String is Palindrome or not.
 */
public class CheckPalindromeString {
	
	public static void main(String args[]) {
		
		// 1. Get the String Input.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String you want to check : ");
		String original = scanner.nextLine();
		scanner.close();
		
		// 2. Reverse the String.
		String reverse = "";
		int length = original.length();
		
		char[] charArr = original.toCharArray();
		
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + charArr[i];
		}
		
		// 3. Compare the input String with reversed String.
		if(original.equals(reverse)){
			// If both the Strings are same, print “Palindrome String.”
			System.out.println(original + " is Palindrome String.");
		} else {
			// Else print “Not a Palindrome String.”
			System.out.println(original + " is Not a Palindrome String.");
		}
	}
}