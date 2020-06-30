package com.kingsclasses;

import java.util.Scanner;

public class CheckArmstrongNumberProgram1 {
	public static void main(String args[]) {
		int number, temp, result = 0, rem;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any Positive Number : ");
		number = scanner.nextInt();
		scanner.close();
		temp = number;
		while (temp != 0) {
			rem = temp % 10;
			result = result + rem * rem * rem;
			temp = temp / 10;
		}
		if (result == number)
			System.out.print("Armstrong Number");
		else
			System.out.print("Not an Armstrong Number");
	}
}
