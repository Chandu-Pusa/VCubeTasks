package com.conditional;

import java.util.Scanner;

public class PasswordMatch {
	static String password = "Admin1234";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password: ");
		String passkey = sc.nextLine();
		if (passkey.equals(password)) {
			System.out.println("Password is correct..! Proceed");
		} else {
			System.out.println("Incorrect Password..!! Try Again");
		}
		
		sc.close();
	}
}
