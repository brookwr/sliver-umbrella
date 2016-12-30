package com.lab2.datatype;

public class HighLowAvgJunit {

	public static int[] numberArrays = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };

	public void getAllOddsNumber(int[] numberArrays) {
		System.out.println("Odd numbers");

		for (int i = 0; i < numberArrays.length; i++) {
			if (numberArrays[i] % 2 != 0) {
				int[] A =  {numberArrays[i]} ;
				System.out.print(numberArrays[i] + " ");
			}
		}

	}

	public void getAllEvensNumber(int[] numberArrays) {
		System.out.println("\nEven Numbers");
		// for (int i = 0; i < numberArrays.length; i++) {

		for (int j = 0; j < numberArrays.length; j++) {

			if (numberArrays[j] % 2 == 0) {

				numberArrays[j] = 2 + numberArrays[j];

				System.out.print(numberArrays[j] + " ");
			}

		}
	}
	// }

	public void divisibleByThree(int[] numberArrays) {

		System.out.println("\nDivisible by three");
		for (int i = 0; i < numberArrays.length; i++) {
			if (numberArrays[i] % 3 == 0) {
				System.out.print(numberArrays[i] + " ");
			}
		}

	}

	public void average(int[] numberArrays) {
		System.out.println("\nAverage of the array");
		int sum = 0;
		for (int i = 0; i < numberArrays.length; i++) {

			sum = sum + numberArrays[i];
		}

		int ave = sum / numberArrays.length;

		System.out.println("The sum of the elements = " + sum + "\nThe length of the array = " + numberArrays.length
				+ "\nThe average of the array = " + ave);

	}

	public void printHighest(int[] numberArrays) {
		int highest = numberArrays[0];

		for (int i = 0; numberArrays.length > i; i++) {
			if (numberArrays[i] > highest) {
				highest = numberArrays[i];
			}
		}
		System.out.println("The highest value = " + highest);

	}

	public void printLowest(int[] numberArrays) {
		int lowest = numberArrays[0];
		for (int i = 0; numberArrays.length > i; i++) {
			if (lowest > numberArrays[i]) {
				lowest = numberArrays[i];
			}
		}
		System.out.println("The lowest value = " + lowest);
	}

	public void printLessAve(int[] numberArrays) {
		System.out.println("Numbers less than the average:");
		int sum = 0;
		for (int i = 0; i < numberArrays.length; i++) {
			sum = sum + numberArrays[i];
		}
		int ave = sum / numberArrays.length;

		for (int j = 0; j < numberArrays.length; j++) {
			if (numberArrays[j] < ave) {
				System.out.print( numberArrays[j] + " " );
			}
		}
	}

	public static void main(String args[]) {
		HighLowAvgJunit obj1 = new HighLowAvgJunit();

		obj1.getAllOddsNumber(numberArrays);
	}

}
