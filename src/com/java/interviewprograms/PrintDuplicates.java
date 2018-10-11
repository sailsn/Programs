package com.java.interviewprograms;

public class PrintDuplicates {

	public static void main(String[] args) {

		String[] words = { "om", "sai", "sree", "sai", "om" };

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					System.out.println(words[j]);
					break;
				}
			}
		}
	}

}
