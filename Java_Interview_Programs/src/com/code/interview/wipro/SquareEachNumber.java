package com.code.interview.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Square of Each Number in a list using java 8
public class SquareEachNumber {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,3,4,5,6,7,8);
		List<Integer> squarList=list.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println("square of list "+squarList);
	}
}
