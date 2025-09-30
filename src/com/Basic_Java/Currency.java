package com.Basic_Java;

// Converting indian rupees to dollar


import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the currency: ");
        int rupee = inp.nextInt();

        double dollar = (double) rupee / 85;

        System.out.println("The Amount is: $"+dollar);
    }
}
