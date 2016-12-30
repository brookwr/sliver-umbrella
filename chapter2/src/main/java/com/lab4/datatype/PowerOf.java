package com.lab4.datatype;

public class PowerOf {

	public int[] powerOfTwo(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			// Math.pow(2, i);
			array[i] = (int) Math.pow(2, i);
			System.out.println(array[i]+" ");

		}

		return array;
	}

	public int[] powerOfThree(int b, int p) {
		int[] array = new int[p];
		for (int i = 0; i < p; i++) {
			array[i] = (int) Math.pow(b, i);
			System.out.print(array[i] + " ");
		}
		return array;

	}

	public static void main(String args[]) {
		PowerOf obj1 = new PowerOf();

		obj1.powerOfThree(3, 5);
	}

}
