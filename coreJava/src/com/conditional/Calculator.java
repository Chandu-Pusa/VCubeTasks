package com.conditional;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int n2 = sc.nextInt();
		System.out.println("Enter one of the Operations + - * /");
		String opr = sc.next();

		switch (opr) {
		case "+": {
			System.out.println();
			System.out.println(n1 + " " + opr + " " + n2 + " = " + (n1 + n2));
			break;
		}
		case "-": {
			System.out.println();
			System.out.println(n1 + " " + opr + " " + n2 + " = " + (n1 - n2));
			break;
		}
		case "*": {
			System.out.println();
			System.out.println(n1 + " " + opr + " " + n2 + " = " + (n1 * n2));
			break;
		}
		case "/": {
			System.out.println();
			if (n2 == 0) {
				System.out.println("We Cannot perform division by Zero");
				break;
			} else {
				System.out.println(n1 + " " + opr + " " + n2 + " = " + (n1 / n2));
				break;
			}
		}
		case "%": {
			System.out.println();
			if (n2 == 0) {
				System.out.println("We Cannot perform modulo by Zero");
				break;
			} else {
				System.out.println(n1 + " " + opr + " " + n2 + " = " + (n1 % n2));
				break;
			}
		}
		default: {
			System.out.println();
			System.out.println("Enter valid operator");
			break;
		}
		}
		sc.close();
	}

}