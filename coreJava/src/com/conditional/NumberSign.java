package com.conditional;

import java.util.Scanner;

public class NumberSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if (num > -1) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}
}
