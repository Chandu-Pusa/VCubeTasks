package com.javamethods;

import java.util.Scanner;

public class Car {

    void carName(String name) {
        System.out.println("Car Name: " + name);
    }

    void carModel(String model) {
        System.out.println("Car Model: " + model);
    }

    void carYear(int year) {
        System.out.println("Car Year: " + year);
    }

    void carPrice(double price) {
        System.out.println("Car Price: " + price);
    }

    void carColor(String color) {
        System.out.println("Car Color: " + color);
    }

    void carSpeed(int speed) {
        System.out.println("Car Speed: " + speed);
    }

    void carMileage(double mileage) {
        System.out.println("Car Mileage: " + mileage);
    }

    void carFuel(String fuel) {
        System.out.println("Car Fuel: " + fuel);
    }

    void carOwner(String owner) {
        System.out.println("Car Owner: " + owner);
    }

    void carInsurance(double insurance) {
        System.out.println("Car Insurance: " + insurance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Car c = new Car();

        System.out.print("Enter Car Name: ");
        c.carName(sc.nextLine());

        System.out.print("Enter Car Model: ");
        c.carModel(sc.nextLine());

        System.out.print("Enter Car Year: ");
        c.carYear(sc.nextInt());

        System.out.print("Enter Car Price: ");
        c.carPrice(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter Car Color: ");
        c.carColor(sc.nextLine());

        System.out.print("Enter Car Speed: ");
        c.carSpeed(sc.nextInt());

        System.out.print("Enter Car Mileage: ");
        c.carMileage(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter Car Fuel Type: ");
        c.carFuel(sc.nextLine());

        System.out.print("Enter Car Owner: ");
        c.carOwner(sc.nextLine());

        System.out.print("Enter Car Insurance: ");
        c.carInsurance(sc.nextDouble());

        sc.close();
    }
}