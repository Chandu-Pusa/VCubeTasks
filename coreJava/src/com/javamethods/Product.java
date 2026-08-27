package com.javamethods;

import java.util.Scanner;

public class Product {

    void productName(String name) {
        System.out.println("Product Name: " + name);
    }

    void productId(String id) {
        System.out.println("Product Id: " + id);
    }

    void productPrice(double price) {
        System.out.println("Product Price: " + price);
    }

    void productQuantity(int quantity) {
        System.out.println("Product Quantity: " + quantity);
    }

    void productBrand(String brand) {
        System.out.println("Product Brand: " + brand);
    }

    void productCategory(String category) {
        System.out.println("Product Category: " + category);
    }

    void productRating(double rating) {
        System.out.println("Product Rating: " + rating);
    }

    void productDiscount(double discount) {
        System.out.println("Product Discount: " + discount);
    }

    void productStock(int stock) {
        System.out.println("Product Stock: " + stock);
    }

    void productWarranty(int warranty) {
        System.out.println("Product Warranty: " + warranty + " months");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.print("Enter Product Name: ");
        p.productName(sc.nextLine());

        System.out.print("Enter Product Id: ");
        p.productId(sc.nextLine());

        System.out.print("Enter Product Price: ");
        p.productPrice(sc.nextDouble());

        System.out.print("Enter Product Quantity: ");
        p.productQuantity(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Product Brand: ");
        p.productBrand(sc.nextLine());

        System.out.print("Enter Product Category: ");
        p.productCategory(sc.nextLine());

        System.out.print("Enter Product Rating: ");
        p.productRating(sc.nextDouble());

        System.out.print("Enter Product Discount: ");
        p.productDiscount(sc.nextDouble());

        System.out.print("Enter Product Stock: ");
        p.productStock(sc.nextInt());

        System.out.print("Enter Product Warranty: ");
        p.productWarranty(sc.nextInt());

        sc.close();
    }
}