package com.Basic_Java;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = inp.nextInt();

        int temp = num;
        int value = 0;

//        public static boolean isArmstrong{
            while (temp > 0) {
                int digit = temp % 10;
                int cube = digit * digit * digit;
                value = value + cube;
                temp = temp / 10; // 10;
            }
//        }
        if (num == value) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
