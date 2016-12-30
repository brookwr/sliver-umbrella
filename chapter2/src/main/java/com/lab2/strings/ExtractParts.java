package com.lab2.strings;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractParts {
	
	
	public static void main(String args[]){
		
		Date bd = new Date();
		
		DateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY");
		
		String bdate = dateFormat.format(bd);
		System.out.println(bdate);
		
	}

}
