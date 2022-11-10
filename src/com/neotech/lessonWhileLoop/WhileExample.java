package com.neotech.lessonWhileLoop;

public class WhileExample {

	public static void main(String[] args) {

		int a = 10;

		while (true) {
			System.out.println("Hello " + a);
			a++;
			break;
		}

		System.out.println("======================");

		for (int i = 1; i <= 4; i++) {

			for (int b = 0; b <= 5; b++) {

				System.out.print("$");
			}
			System.out.println();
		}

	}

}
