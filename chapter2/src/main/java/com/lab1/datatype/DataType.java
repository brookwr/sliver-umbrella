package com.lab1.datatype;

import java.lang.reflect.Array;

public class DataType {

	public String var = "Hello how are you";
	public char varTwo = 'H';
	public int a;
	public long d = new Long(a);
	public int c = (int) d;
	public String f = "10";
	public int result = Integer.parseInt(f);

	public void add() {
		int a = 10;
		int b = 40;
		double c = 142.4;
		double d = 333.62;
		double sum = a + b + c + d;
		System.out.println(sum);

	}

	public void operate() {
		int a = 45;
		int b = -21;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		int inc = a++;
		int dec = a--;

		System.out.println("sum = " + sum + "\nsub = " + sub + "\nmul = " + mul + "\ndiv = " + div + "\nmod = " + mod
				+ "\ninc = " + inc + "\ndec = " + dec);

	}

	public static void main(String args[]) {

		DataType obj1 = new DataType();
		int[][] doubleArray = new int [7][5]; 

		
		obj1.add();
		obj1.operate();

		int[] one = new int [10];
		one[0] = 1;
		one[1] = 1;
		one[2] = 1;
		one[3] = 1;
		one[4] = 1;
		one[5] = 1;
		one[6] = 1;
		one[7] = 1;
		one[8] = 1;
		one[9] = 1;
		
		for (int i = 0; i<10; i++) {

			System.out.println(one[i]);
		}
		
		String [] two = {"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		for (int j = 0; j< two.length; j++ ){
			System.out.println(two[j]);
		}
		

	}
}