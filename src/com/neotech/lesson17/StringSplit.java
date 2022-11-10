package com.neotech.lesson17;

public class StringSplit {

	public static void main(String[] args) {

		String sentence = "Today is Wednesday";

		String[] array = sentence.split("e");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " --------- ");
		}

		System.out.println();

		String word = "Sevilay";

		String[] s = word.split("a");

		for (int a = 0; a < s.length; a++) {
			System.out.print(s[a] + " ");

		}

	}

}
