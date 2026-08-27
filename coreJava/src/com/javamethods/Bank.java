package com.javamethods;

import java.util.Scanner;

public class Bank {

    int balance;

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double depo) {
        balance += depo;
        showBalance();
    }

    void withdraw(double wd) {
        balance -= wd;
        showBalance();
    }

    void customerName(String name) {
        System.out.println("Customer Name: " + name);
    }

    void customerId(String cid) {
        System.out.println("Customer Id: " + cid);
    }

    void calcInterest(int percentage) {
        System.out.println("Interest is " + (balance * percentage) / 100);
        showBalance();
    }

    void addInterest(double interest) {
        balance += interest;
        showBalance();
    }

    void payBill(double amount) {
        balance -= amount;
        showBalance();
    }

    void cashBack(double amount) {
        balance += amount;
        showBalance();
    }

    void checkLoanEligibility(double monthlyIncome) {
        if (monthlyIncome >= 30000) {
            System.out.println("Eligible for Loan");
        } else {
            System.out.println("Not eligible for Loan");
        }
    }

    void setTransactionLimit(double limit) {
        System.out.println("Transaction limit is: " + limit);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        b.customerName(name);

        System.out.print("Enter Customer Id: ");
        String cid = sc.nextLine();
        b.customerId(cid);

        System.out.print("Enter Deposit Amount: ");
        double depo = sc.nextDouble();
        b.deposit(depo);

        System.out.print("Enter Withdraw Amount: ");
        double wd = sc.nextDouble();
        b.withdraw(wd);

        System.out.print("Enter Interest Percentage: ");
        int percentage = sc.nextInt();
        b.calcInterest(percentage);

        System.out.print("Enter Additional Interest: ");
        double interest = sc.nextDouble();
        b.addInterest(interest);

        System.out.print("Enter Bill Amount: ");
        double amount = sc.nextDouble();
        b.payBill(amount);

        System.out.print("Enter Cashback Amount: ");
        double cashback = sc.nextDouble();
        b.cashBack(cashback);

        System.out.print("Enter Monthly Income: ");
        double monthlyIncome = sc.nextDouble();
        b.checkLoanEligibility(monthlyIncome);

        System.out.print("Enter Transaction Limit: ");
        double limit = sc.nextDouble();
        b.setTransactionLimit(limit);

        sc.close();
    }
}