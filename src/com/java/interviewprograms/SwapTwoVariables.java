package com.java.interviewprograms;

public class SwapTwoVariables {

	public static void main(String[] args) {

		int a = 20;
		int b = 40;

		System.out.println("Before Swapping a: " + a + " and b: " + b);

		a = a + b; // 60

		b = a - b;// 60 - 40
		a = a - b;

		System.out.println("After Swapping a: " + a + " and b: " + b);

	}

}
