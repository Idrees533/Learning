package com.learn;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestElement {

	public static void main(String[] args) {
		int array[] = {1,3,2,4,5,6,6,9,9,10,11};
		
		System.out.println(findSecondHighestElement(array));
		
	}

	private static Integer findSecondHighestElement(int[] array) {
		// TODO Auto-generated method stub
		return Arrays.stream(array).boxed().distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
	}
}
