package com.javamethods;

import java.util.Scanner;

public class Library {

    void bookName(String name) {
        System.out.println("Book Name: " + name);
    }

    void bookId(String id) {
        System.out.println("Book Id: " + id);
    }

    void authorName(String author) {
        System.out.println("Author Name: " + author);
    }

    void bookPrice(double price) {
        System.out.println("Book Price: " + price);
    }

    void bookPages(int pages) {
        System.out.println("Book Pages: " + pages);
    }

    void bookLanguage(String language) {
        System.out.println("Book Language: " + language);
    }

    void memberName(String name) {
        System.out.println("Member Name: " + name);
    }

    void memberId(String id) {
        System.out.println("Member Id: " + id);
    }

    void issueDays(int days) {
        System.out.println("Issue Days: " + days);
    }

    void lateFee(double fee) {
        System.out.println("Late Fee: " + fee);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library l = new Library();

        System.out.print("Enter Book Name: ");
        l.bookName(sc.nextLine());

        System.out.print("Enter Book Id: ");
        l.bookId(sc.nextLine());

        System.out.print("Enter Author Name: ");
        l.authorName(sc.nextLine());

        System.out.print("Enter Book Price: ");
        l.bookPrice(sc.nextDouble());

        System.out.print("Enter Number of Pages: ");
        l.bookPages(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Book Language: ");
        l.bookLanguage(sc.nextLine());

        System.out.print("Enter Member Name: ");
        l.memberName(sc.nextLine());

        System.out.print("Enter Member Id: ");
        l.memberId(sc.nextLine());

        System.out.print("Enter Issue Days: ");
        l.issueDays(sc.nextInt());

        System.out.print("Enter Late Fee: ");
        l.lateFee(sc.nextDouble());

        sc.close();
    }
}