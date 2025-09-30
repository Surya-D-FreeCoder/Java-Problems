package com.Basic_Java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number you want to run: ");
        int num  = inp.nextInt();

        int a = 0;
        int b = 1;
        int next;

        System.out.print("Fibonacci Series: " + a +" "+ b + " ");

        for (int i = 0; i < num; i++) {
            next = a+b;
            a = b;
            b = next;
            System.out.print(next +" 1");

        }
    }
}
