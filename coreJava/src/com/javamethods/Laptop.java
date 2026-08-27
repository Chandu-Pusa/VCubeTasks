package com.javamethods;

import java.util.Scanner;

public class Laptop {

    void laptopBrand(String brand) {
        System.out.println("Laptop Brand: " + brand);
    }

    void laptopModel(String model) {
        System.out.println("Laptop Model: " + model);
    }

    void laptopPrice(double price) {
        System.out.println("Laptop Price: " + price);
    }

    void laptopRam(int ram) {
        System.out.println("Laptop RAM: " + ram + " GB");
    }

    void laptopStorage(int storage) {
        System.out.println("Laptop Storage: " + storage + " GB");
    }

    void laptopProcessor(String processor) {
        System.out.println("Laptop Processor: " + processor);
    }

    void laptopColor(String color) {
        System.out.println("Laptop Color: " + color);
    }

    void laptopWeight(double weight) {
        System.out.println("Laptop Weight: " + weight + " kg");
    }

    void laptopScreen(double screen) {
        System.out.println("Laptop Screen: " + screen + " inches");
    }

    void laptopWarranty(int warranty) {
        System.out.println("Laptop Warranty: " + warranty + " months");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Laptop l = new Laptop();

        System.out.print("Enter Laptop Brand: ");
        l.laptopBrand(sc.nextLine());

        System.out.print("Enter Laptop Model: ");
        l.laptopModel(sc.nextLine());

        System.out.print("Enter Laptop Price: ");
        l.laptopPrice(sc.nextDouble());

        System.out.print("Enter Laptop RAM: ");
        l.laptopRam(sc.nextInt());

        System.out.print("Enter Laptop Storage: ");
        l.laptopStorage(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Laptop Processor: ");
        l.laptopProcessor(sc.nextLine());

        System.out.print("Enter Laptop Color: ");
        l.laptopColor(sc.nextLine());

        System.out.print("Enter Laptop Weight: ");
        l.laptopWeight(sc.nextDouble());

        System.out.print("Enter Laptop Screen Size: ");
        l.laptopScreen(sc.nextDouble());

        System.out.print("Enter Laptop Warranty: ");
        l.laptopWarranty(sc.nextInt());

        sc.close();
    }
}