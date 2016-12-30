package com.lab1.strings;

public class StringAssignments {

	public static String b = "hello, how are you?";
	public static String e = "Hello";
	public static String f = "HELLO";
	public static String g = "HELLO HOW ARE YOU AND WHERE ARE YOU";
	public static String h = "This is a java institute of insurance and insu";

	public int countChar(String a) {
		System.out.println(a.length());
		return a.length();
	}

	public int countWord(String a) {
		int count = 1;
		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

	public void replaceSmall(String a) {

		String c = a.replace("hello,", "HELLO!");
		System.out.println(c);
	}

	public void replaceComma(String a) {
		String d = a.replace(" ", ",");
		System.out.println(d);
	}

	public void returnThreeChar(String a) {
		String d = a.substring(0, 3);
		System.out.println(d);
	}

	public boolean compareStrings(String a, String b) {
		System.out.println("Without Case: " + a.equalsIgnoreCase(b));
		System.out.println("With case: " + a.equals(b));

		return a.equalsIgnoreCase(b);
	}

	public int countA(String a) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'E') {
				count++;
			}
		}
		System.out.println(count);
		return count;

	}

	public void check4Words(String a, String b) {
		if (a.contains(b) == true) {
			String z = a.replace(b, "JSS");
			System.out.println(z);
		}

	}

	public static void main(String args[]) {

		StringAssignments obj1 = new StringAssignments();

		obj1.check4Words(h, "institute");

	}

}
