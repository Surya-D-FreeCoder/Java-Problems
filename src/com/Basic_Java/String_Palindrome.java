package com.Basic_Java;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = inp.nextLine();

        String rev = "";

        for (int i = word.length()-1; i >= 0; i--) {
//            System.out.println(word.charAt(i));
            rev += word.charAt(i);
        }

        if(word.equals(rev)){
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
