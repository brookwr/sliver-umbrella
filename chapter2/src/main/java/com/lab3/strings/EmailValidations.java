package com.lab3.strings;

public class EmailValidations {
	
	public static String input = "Mso@@hot\\mail..com";

	public static String changeString(String a){
	String temp;
	temp = input.replaceAll("\\\\", "");
	temp = temp.replaceAll("\\.\\.", ".");
	temp = temp.replaceAll("@@", "@");
	return temp;
	}	

	public static void main(String[] args) {
		String output = changeString(input);
		
		System.out.println(output);
		

	}

}
