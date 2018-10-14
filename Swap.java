package com.spring.restexample;

public class Swap {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;

		a = a + b; // 50
		b = a - b; // 50 - 20 = 30
		a = a - b; // 50 - 30 = 20
		System.out.println("Swap two numbers: a=" + a + "b=" + b);

		int[] arr = { 20, 5, 10, 40, 3 };

		for (int i = 0; i <= arr.length - 1; i++) {

			arr[i + 1] = arr[i + 1] + arr[i];
			arr[i] = arr[i + 1] - arr[i];
			arr[i + 1] = arr[i + 1] - arr[i];

			System.out.println(arr[i]);
		}

	}

}
