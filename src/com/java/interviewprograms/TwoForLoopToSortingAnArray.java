package com.java.interviewprograms;

public class TwoForLoopToSortingAnArray {

	public static void main(String[] args) {

		int[] a = { 40, 20, 5 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					temp = a[i]; // 40
					a[i] = a[j]; // 20
					a[j] = temp; // 40

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
