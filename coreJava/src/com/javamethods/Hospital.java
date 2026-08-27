package com.javamethods;

import java.util.Scanner;

public class Hospital {

    void patientName(String name) {
        System.out.println("Patient Name: " + name);
    }

    void patientId(String id) {
        System.out.println("Patient Id: " + id);
    }

    void patientAge(int age) {
        System.out.println("Patient Age: " + age);
    }

    void patientDisease(String disease) {
        System.out.println("Patient Disease: " + disease);
    }

    void doctorName(String name) {
        System.out.println("Doctor Name: " + name);
    }

    void roomNumber(int room) {
        System.out.println("Room Number: " + room);
    }

    void treatmentCost(double cost) {
        System.out.println("Treatment Cost: " + cost);
    }

    void patientPhone(long phone) {
        System.out.println("Patient Phone: " + phone);
    }

    void bloodGroup(String blood) {
        System.out.println("Blood Group: " + blood);
    }

    void insuranceAmount(double amount) {
        System.out.println("Insurance Amount: " + amount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hospital h = new Hospital();

        System.out.print("Enter Patient Name: ");
        h.patientName(sc.nextLine());

        System.out.print("Enter Patient Id: ");
        h.patientId(sc.nextLine());

        System.out.print("Enter Patient Age: ");
        h.patientAge(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Disease: ");
        h.patientDisease(sc.nextLine());

        System.out.print("Enter Doctor Name: ");
        h.doctorName(sc.nextLine());

        System.out.print("Enter Room Number: ");
        h.roomNumber(sc.nextInt());

        System.out.print("Enter Treatment Cost: ");
        h.treatmentCost(sc.nextDouble());

        System.out.print("Enter Patient Phone: ");
        h.patientPhone(sc.nextLong());

        sc.nextLine();

        System.out.print("Enter Blood Group: ");
        h.bloodGroup(sc.nextLine());

        System.out.print("Enter Insurance Amount: ");
        h.insuranceAmount(sc.nextDouble());

        sc.close();
    }
}