package com.Basic_Java;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = inp.nextInt();

        System.out.print("Enter the number: ");
        int b = inp.nextInt();

        if (a<b) {
            System.out.println("B is Greater");
        } else if (a>b) {
            System.out.println("A is Greater");
        } else {
            System.out.println("Both the values are equal");
        }
    }
}
