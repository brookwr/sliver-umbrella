package com.lab5.datatype;

public class JaggedArray {

	public static void main(String args[]) {
		String[][] array = { { "Student Name", "Tutorial 1", "Tutorial 2", "Tutorial 3" },
				{ "Tony", "JAVA", "C", "C++" }, { "Thomas", "JAVA", "UNIX", " " }, { "Dinil", "Linux", "Oracle", " " },
				{ "Delvin", "RDBMS", "C#", "ORACLE" } };

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("\n     ");
		}

	}

}
