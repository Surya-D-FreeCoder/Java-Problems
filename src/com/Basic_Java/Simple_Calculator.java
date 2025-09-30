package com.Basic_Java;

import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = inp.nextInt();

        System.out.print("Enter the second number: ");
        int b = inp.nextInt();

        System.out.print("Enter the operation: ");
        String operation = inp.next();


        switch (operation) {
            case "+" -> System.out.println("The Solution is: " + (a + b));
            case "-" -> System.out.println("The Solution is: " + (a - b));
            case "*" -> System.out.println("The Solution is: " + (a * b));
            case "/" -> System.out.println("The Solution is: " + (a / b));
            case "%" -> System.out.println("The Solution is: " + (a % b));
            default -> System.out.println("Enter the correct Operation");
        }

        // Regular Method

//        if(operation.equals("+")) {
//            System.out.println("The Solution is: "+ (a+b));
//        } else if(operation.equals("-")) {
//            System.out.println("The Solution is: "+ (a-b));
//        } else if(operation.equals("*")) {
//            System.out.println("The Solution is: "+ (a*b));
//        } else if(operation.equals("/")) {
//            System.out.println("The Solution is: "+ (a/b));
//        } else if(operation.equals("%")) {
//            System.out.println("The Solution is: "+ (a%b));
//        } else {
//            System.out.println("Enter the correct Operation");
//        }

    }
}
