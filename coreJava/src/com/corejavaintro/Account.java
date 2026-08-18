package com.corejavaintro;

public class Account {
	static int accNum = 100;
	
	String cName;
	int balance;
	String status;
	
	static {
		System.out.println("               ATM Account Details");
		System.out.println("----------------------------------------------------");
		System.out.println();
	}
	
	{
		accNum++;
		System.out.println("Customer Account Number: "+accNum);
	}
	
	void info() {
		System.out.println("Customer Name: "+ cName);
		System.out.println("Customer Account Balance: "+ balance);
		System.out.println("Customer Account Status: "+ status);
		System.out.println("*************************************************");
		System.out.println();
	}

	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.cName = "Ameer";
		a1.balance = 100000000;
		a1.status = "Active";
		a1.info();
		
		Account a2 = new Account();
		a2.cName = "Charan";
		a2.balance = 100000;
		a2.status = "Active";
		a2.info();
		
		Account a3 = new Account();
		a3.cName = "Eshwar";
		a3.balance = 100000;
		a3.status = "Inactive";
		a3.info();
	}

}
