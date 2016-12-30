package com.lab1.datatype;

public class SampleTest {

	public static int[] A = { -1, 3, 2, 4, 5, -2, 10 };

	public int solution(int[] A) {

		int i, j;
		int leftSum, rightSum;
		// position in the array
		for (i = 0; i < A.length; ++i) {
			leftSum = 0;
			rightSum = 0;

			// get left sum
			for (j = 0; j < i; j++)
				leftSum += A[j];
			//System.out.println("leftSum = " + leftSum);

			// get right sum
			for (j = A.length - 1; j > i; j--)
				rightSum += A[j];
			//System.out.println("rightSum = " + rightSum);

			// check if right and left sum are the same
			if (leftSum == rightSum)
				return i;
			//System.out.println(i);

		}
		return -1;
	}

	public static void main(String args[]) {

		SampleTest obj1 = new SampleTest();

		System.out.println(obj1.solution(A));

	}
}
