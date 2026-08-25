package com.corejavaintro;

public class Task1Aug25 {

    public static void main(String[] args) {

        // Primitive int
        int a = 10;

        // Autoboxing: int -> Integer
        Integer a1 = a;

        System.out.println(a);
        System.out.println(a1);

        // Autounboxing: Integer -> int
        int a2 = a1;

        System.out.println(a2);
    }
}