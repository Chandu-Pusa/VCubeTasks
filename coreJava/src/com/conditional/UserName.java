package com.conditional;

import java.util.Scanner;

public class UserName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		if (name.length() <= 15) {
			System.out.println("Valid User Name");
		} else {
			System.out.println("Invalid User Name");
		}
	}
}
