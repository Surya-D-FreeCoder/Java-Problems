package com.Conditions_Loops;

import java.util.Scanner;

public class Largest {
//	Take integer inputs till the user enters 0 and print the largest number from all.
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		boolean notZero = true;
		int ans = 0;
		
		while(notZero) {
			System.out.print("Enter a number: ");
			int num = inp.nextInt();
			if(num !=0 ) {
				if (num > ans) {
					ans = num;
				}
			} else {
				notZero = false;
			}
		}
		System.out.print("THe Largest Number is: "+ ans);
		inp.close();
	}
}
