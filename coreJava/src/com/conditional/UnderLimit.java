package com.conditional;

import java.util.Scanner;

public class UnderLimit {
	static int limit = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		if (num > 100) {
			System.out.println("not in Limit");
		} else {
			System.out.println("Under the Limit");
		}
	}

}
