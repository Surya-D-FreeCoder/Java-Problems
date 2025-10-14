package com.Conditions_Loops;

import java.util.Scanner;

public class SumOfAllNumbers {
//	This is to sum the all numbers getting from the user till user enters 0
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		

		
		boolean notZero = true;
		int ans = 0;
		
		while(notZero) {
			System.out.print("Enter a number: ");
			int num = inp.nextInt();
			if(num != 0) {
				ans += num;
			} else {
				notZero = false;
			}
		}
//		System.out.println();1
		System.out.print("The otal Sum is: "+ ans);
	}
}
