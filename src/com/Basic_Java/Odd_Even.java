package com.Basic_Java;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = inp.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}
