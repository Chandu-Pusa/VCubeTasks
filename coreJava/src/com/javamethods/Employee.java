package com.javamethods;

import java.util.Scanner;

public class Employee {

    void empName(String name) {
        System.out.println("Employee Name: " + name);
    }

    void empId(String eId) {
        System.out.println("Employee id: " + eId);
    }

    void empDept(String dept) {
        System.out.println("Employee dept: " + dept);
    }

    void empSal(double sal) {
        System.out.println("Employee Sal: " + sal);
    }

    void empExp(int exp) {
        System.out.println("Employee exp: " + exp);
    }

    void compName(String cName) {
        System.out.println("Company Name: " + cName);
    }

    void empShift(String shift) {
        System.out.println("Employee Shift: " + shift);
    }

    void empBonus(double bonus) {
        System.out.println("Employee Bonus: " + bonus);
    }

    void empLeaveCount(int count) {
        System.out.println("Employee Leave Count: " + count);
    }

    void empManager(String name) {
        System.out.println("Employee's Manager Name: " + name);
    }

    void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        emp.empName(name);

        System.out.print("Enter Employee ID: ");
        String eId = sc.nextLine();
        emp.empId(eId);

        System.out.print("Enter Employee Department: ");
        String dept = sc.nextLine();
        emp.empDept(dept);

        System.out.print("Enter Employee Salary: ");
        double sal = sc.nextDouble();
        emp.empSal(sal);

        System.out.print("Enter Employee Experience: ");
        int exp = sc.nextInt();
        emp.empExp(exp);

        sc.nextLine(); 

        System.out.print("Enter Company Name: ");
        String cName = sc.nextLine();
        emp.compName(cName);

        System.out.print("Enter Employee Shift: ");
        String shift = sc.nextLine();
        emp.empShift(shift);

        System.out.print("Enter Employee Bonus: ");
        double bonus = sc.nextDouble();
        emp.empBonus(bonus);

        System.out.print("Enter Employee Leave Count: ");
        int count = sc.nextInt();
        emp.empLeaveCount(count);

        sc.nextLine(); 

        System.out.print("Enter Employee Manager Name: ");
        String manager = sc.nextLine();
        emp.empManager(manager);

        sc.close();
    }
}