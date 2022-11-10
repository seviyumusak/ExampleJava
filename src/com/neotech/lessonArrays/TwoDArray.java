package com.neotech.lessonArrays;

public class TwoDArray {

	public static void main(String[] args) {

		int[][] nums = { { 2, 3, 4 }, { 1, 5, 7 } };

		// nested enhanced/advanced for loop

		for (int[] row : nums) {

			for (int element : row) {
				System.out.print(element);
			}
			System.out.println();
		}

		System.out.println("====================");

		// declare variable = name = name of array with array symbols

		int big = nums[0][0];

		// enhanced nested for loop
		// for (declare variable with array name row : name of array)

		for (int[] row : nums) {

			for (int element : row) {

				if (element > big) {

					big = element;

				}
			}
		}

		System.out.println("The big number is: " + big);

	}

}
