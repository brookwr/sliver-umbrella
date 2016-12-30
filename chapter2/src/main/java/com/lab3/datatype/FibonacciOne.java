package com.lab3.datatype;

public class FibonacciOne {

	private void printFibonacci(int n) {

		int a = 0;
		int b = 1;
		int d;

		for (int i = 0; i < n; i++) {
			d = a + b;

			a = b;
			b = d;

			System.out.print(d +" ");
		}
	}

	public static void main(String args[]) {
		FibonacciOne obj1 = new FibonacciOne();

		obj1.printFibonacci(8);
	}

}