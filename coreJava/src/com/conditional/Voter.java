package com.conditional;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Eligible Voter");
		}
		else
			System.out.println("Non Eligible");
	}
}
