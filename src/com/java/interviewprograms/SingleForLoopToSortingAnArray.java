package com.java.interviewprograms;

public class SingleForLoopToSortingAnArray {

	public static void main(String[] args) {

		int[] a = { 40, 20, 5 };

		for (int i = 1; i < a.length; i++) {

			if (a[i] < a[i - 1]) {

				a[i] = a[i] + a[i - 1]; // 60 // a[1]== 60

				a[i - 1] = a[i] - a[i - 1]; // 60-40 = 20 //a[0] == 20

				a[i] = a[i] - a[i - 1]; // 60 - 20 = 40 // a[1] = 40

				i = 0;

			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
