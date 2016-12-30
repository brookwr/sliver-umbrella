package com.lab1.datatype;

public class HighLowAvg {

	public void pickOdds() {

		int sum = 0;
		int[] numberArrays = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		int highest = numberArrays[0];
		int lowest = numberArrays[0];
		int lowerAvg = numberArrays[0];

		// Printing even numbers
		for (int j = 0; numberArrays.length > j; j++) {
			if (numberArrays[j] % 2 == 0) {
				numberArrays[j] += 2;

				for (int i = 0; numberArrays.length > i; i++) {
					System.out.print(numberArrays[i] + " ");
				}
				System.out.println(numberArrays[j] + " even number ");

			}
		}
		// Printing numbers that are divisible by 3
		for (int i = 0; numberArrays.length > i; i++) {
			if (numberArrays[i] % 3 == 0) {
				System.out.println(numberArrays[i] + " divisible by 3");
			}
		}
		// Average of of numberArrays

		for (int i = 0; numberArrays.length > i; i++) {
			sum = sum + numberArrays[i];
		}
		int avg = sum / numberArrays.length;
		System.out.println(sum);
		System.out.println(avg + " average");

		// The highest value in the Array
		for (int i = 0; numberArrays.length > i; i++) {
			if (numberArrays[i] > highest) {
				highest = numberArrays[i];
			}
			if (numberArrays[i] < lowest) {
				lowest = numberArrays[i];
			}
			if (numberArrays[i] < avg) {
				System.out.println("Numbers lower than avg " + numberArrays[i]);

			}

		}
		System.out.println("The highest number " + highest);
		System.out.println("The lowest number " + lowest);

	}

	public static void main(String args[]) {

		HighLowAvg obj1 = new HighLowAvg();
		obj1.pickOdds();

	}

}
