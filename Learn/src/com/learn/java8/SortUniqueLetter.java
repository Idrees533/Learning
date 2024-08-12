package com.learn.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortUniqueLetter {

	public static void main(String[] args) {
		 final List<Integer> inputArrayList = Arrays.asList(1, 3, 2, 4, 3, 1, 2);
		 final List<Integer> outputArrayList=inputArrayList.stream().distinct()
		 					.sorted(Comparator.reverseOrder())
		 					.collect(Collectors.toList());
		 System.out.println(outputArrayList);
	}
}
