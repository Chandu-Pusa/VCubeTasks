package com.javamethods;

import java.util.Scanner;

public class Student {

    int studentPerfomanceScore = 50;

    void studentName(String sName) {
        System.out.println("Student Name: " + sName);
    }

    void studentId(String sId) {
        System.out.println("Student Id: " + sId);
    }

    void studentRegno(long regNo) {
        System.out.println("Student Registered number: " + regNo);
    }

    void studentClass(String cls) {
        System.out.println("Student Class: " + cls);
    }

    void studentBranch(String branch) {
        System.out.println("Student Branch: " + branch);
    }

    void showSPS() {
        System.out.println("Student Performance Score: " + studentPerfomanceScore);
    }

    void addSPS(int num) {
        studentPerfomanceScore += num;
        showSPS();
    }

    void deductSPS(int num) {
        studentPerfomanceScore -= num;
        showSPS();
    }

    void studentAge(int age) {
        System.out.println("Student Age: " + age);
    }

    void studentPhone(long phoneNo) {
        System.out.println("Student Phone Number: " + phoneNo);
    }

    void studentCollege(String college) {
        System.out.println("Student College: " + college);
    }

    void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        s.studentName(name);

        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        s.studentId(id);

        System.out.print("Enter Registration Number: ");
        long regNo = sc.nextLong();
        s.studentRegno(regNo);

        sc.nextLine();

        System.out.print("Enter Student Class: ");
        String cls = sc.nextLine();
        s.studentClass(cls);

        System.out.print("Enter Student Branch: ");
        String branch = sc.nextLine();
        s.studentBranch(branch);

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        s.studentAge(age);

        System.out.print("Enter Student Phone Number: ");
        long phoneNo = sc.nextLong();
        s.studentPhone(phoneNo);

        sc.nextLine();

        System.out.print("Enter Student College: ");
        String college = sc.nextLine();
        s.studentCollege(college);


        s.showSPS();

        System.out.print("Enter marks to add: ");
        int add = sc.nextInt();
        s.addSPS(add);

        System.out.print("Enter marks to deduct: ");
        int deduct = sc.nextInt();
        s.deductSPS(deduct);

        sc.close();
    }
}