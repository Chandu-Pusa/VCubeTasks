package com.javamethods;

import java.util.Scanner;

public class Mobile {

    void mobileBrand(String brand) {
        System.out.println("Mobile Brand: " + brand);
    }

    void mobileModel(String model) {
        System.out.println("Mobile Model: " + model);
    }

    void mobilePrice(double price) {
        System.out.println("Mobile Price: " + price);
    }

    void mobileRam(int ram) {
        System.out.println("Mobile RAM: " + ram + " GB");
    }

    void mobileStorage(int storage) {
        System.out.println("Mobile Storage: " + storage + " GB");
    }

    void mobileColor(String color) {
        System.out.println("Mobile Color: " + color);
    }

    void mobileCamera(double camera) {
        System.out.println("Mobile Camera: " + camera + " MP");
    }

    void mobileBattery(int battery) {
        System.out.println("Mobile Battery: " + battery + " mAh");
    }

    void mobileRating(double rating) {
        System.out.println("Mobile Rating: " + rating);
    }

    void mobileWarranty(int warranty) {
        System.out.println("Mobile Warranty: " + warranty + " months");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mobile m = new Mobile();

        System.out.print("Enter Mobile Brand: ");
        m.mobileBrand(sc.nextLine());

        System.out.print("Enter Mobile Model: ");
        m.mobileModel(sc.nextLine());

        System.out.print("Enter Mobile Price: ");
        m.mobilePrice(sc.nextDouble());

        System.out.print("Enter Mobile RAM: ");
        m.mobileRam(sc.nextInt());

        System.out.print("Enter Mobile Storage: ");
        m.mobileStorage(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Mobile Color: ");
        m.mobileColor(sc.nextLine());

        System.out.print("Enter Camera MP: ");
        m.mobileCamera(sc.nextDouble());

        System.out.print("Enter Battery: ");
        m.mobileBattery(sc.nextInt());

        System.out.print("Enter Mobile Rating: ");
        m.mobileRating(sc.nextDouble());

        System.out.print("Enter Warranty: ");
        m.mobileWarranty(sc.nextInt());

        sc.close();
    }
}