package com.neotech.lessonloop;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		// Variables are already declared and given

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = s.nextInt();
		int b = s.nextInt();

		// WRITE YOUR CODE HERE:

		if (a == b) {
			System.out.println(a + " and " + b + " are equal");
		}

		else if (a < b) {
			System.out.println(a + " is less than " + b);
		}

		else if (a > b) {
			System.out.println(a + " is greater than " + b);

		}

	}
}