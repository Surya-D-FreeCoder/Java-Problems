package com.Conditions_Loops;

import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
//		System.out.println("FibonacciSeries");
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = inp.nextInt();
		
		System.out.println();
		
		int a = 0, b = 1;
		System.out.print("Fibonacci Series: "+ a + " " + b);
		
		
		for(int i = 0; i < num; i++) {
			int next = a + b;
			a = b;
			b = next;
			
			System.out.print(" " + b);
		}
		inp.close();
	}
}
