package com.Conditions_Loops;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = inp.nextInt();	
		
		System.out.print("The Factors are: ");
			
		for(int i = 1; i <= num / 2; i++) {
			if(num % i == 0) {
				System.out.print( i + " ");
			}
		}
		inp.close();
	}
}
