package com.conditional;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int temp = sc.nextInt();
		if (temp > 25) {
			System.out.println("Hot");
		} else {
			System.out.println("Cool");
		}
		
		sc.close();
	}
}
