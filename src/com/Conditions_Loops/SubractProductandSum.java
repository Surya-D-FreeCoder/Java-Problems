package com.Conditions_Loops;

//1281Leetcode ==> https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/


import java.util.Scanner;

public class SubractProductandSum  {
        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);

            System.out.print("Enter the number: ");
            int number = num.nextInt();

            int product = 1;
            int sum = 0;
            int temp = number;

            while (temp > 0){
                int last = temp % 10;
                product = product * last;
                sum = sum + last;
                temp = temp / 10;
            }

            int result = product - sum;
            System.out.println("The Diffrence between the Product & Sum of the number " + number + " is: " + result);
            
            num.close();
       }
}

