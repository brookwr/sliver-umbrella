package com.lab3;

public class Fibonacci {

	public void getFibonacci(int n) {
		int a = 0;
		int b = 1;
		int d;

		for (int i = 0; i < n; ++i) {
			d = a + b;
			System.out.print(" " + d);
			a = b;
			b = d;
		}

	}

	public static void main(String args[]) {
		Fibonacci obj1 = new Fibonacci();
		obj1.getFibonacci(10);

	}

}
