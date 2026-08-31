package com.javamethods;
//Create a class named ATM.
//
//*Static Variables*
//bankName field common for all users
//
//*Instance Variables* accountNumber balance
//
//*Methods*: -
//deposit()
//withdraw()
//checkBalance()
//
//->Create 2 ATM account objects.
//->Assign appropriate values to the instance variables for each account.
//->Perform different deposit and withdrawal operations on both accounts using the given methods.
//->Display the balance of each account using the checkbalance () method.
public class ATM {
	
	static String bankName = "VCUBE";
	
	String accountNumber;
	double balance;
	
	void deposit(double amount) {
		balance+=amount;
		System.out.println("deposit of amount "+amount+ " is done to the account "+accountNumber);
		checkBalance();
	}
	
	void withdraw(double amount) {
		balance-=amount;
		System.out.println("withdrawl of amount "+amount+ " is done from the account "+accountNumber);
		checkBalance();
	}
	
	void checkBalance() {
		System.out.println("Current Balance is : "+ balance);
		System.out.println();
	}
	
	void display() { 
		System.out.println("customer details: ");
		System.out.println("customer AccountNumber: "+accountNumber);
		System.out.println("customer balance: "+balance);
		System.out.println("***************************************************************");
	}
	

	public static void main(String[] args) {
		
		System.out.println("Welcome to "+bankName+" Bank..!");
		System.out.println();
		
		ATM a1 = new ATM();
		a1.accountNumber = "A101";
		a1.balance = 10000;
		a1.display();
		
		ATM a2 = new ATM();
		a2.accountNumber = "A102";
		a2.balance = 10000;
		a2.display();
		
		a1.deposit(5000);
		
		a2.withdraw(1000);
		
		
		
	}

}


