package com.Basic_Java;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the Principal: ");
        double p = inp.nextDouble();
        System.out.print("Enter the Rate: ");
        double r = inp.nextDouble();
        System.out.print("Enter the Time: ");
        double n = inp.nextDouble();

        double interest = (p*n*r) / 100;
        System.out.println(interest);
    }
}
