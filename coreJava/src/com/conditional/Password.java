package com.conditional;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String pw = sc.nextLine();
		if (pw.length() < 8) {
			System.out.println("Invalid");
		} else {
			System.out.println("Valid");
		}

	}
}
