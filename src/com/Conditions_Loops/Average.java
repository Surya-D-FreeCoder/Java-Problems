package com.Conditions_Loops;

public class Average {
	public static void main(String[] args) {
		int[] arr = new int[]{10,20,30,40,50,60,70};
		float sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		float avg = sum / arr.length;
		System.out.println(avg);
	}
}
