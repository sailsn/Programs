package com.java.interviewprograms;

public class RemoveDuplicateFromAnArray {

	public static void main(String[] args) {

		String[] str = { "AA", "BB", "CC", "AA", "BB" };
		int indexlocation = 0;

		String[] tempArray = new String[str.length];

		int count;
		boolean flag;

		for (int i = 0; i < str.length; i++) {
			count = 0;
			flag = true;
			for (int j = 0; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
					if (count > 1) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				tempArray[indexlocation] = str[i];
				indexlocation++;
			}
		}
		for(int i = 0; i < tempArray.length; i++)
		{
			System.out.println(tempArray[i]);
		}

	}

}
