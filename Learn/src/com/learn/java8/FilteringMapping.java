package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringMapping {

	public static void main(String[] args) {
		
			List<Integer> list=Arrays.asList(1,2,3,4,5,6);
			//get the even number and square of it
		List orderList	=list.stream().filter(n->n%2==0)
			.map(n->n*n).collect(Collectors.toList());
		System.out.println("filter and mapping order list"+orderList);
		
		//Summing the interger
		
				Integer summ=list.stream().reduce(0, Integer::sum);
				System.out.println("Sum "+summ);
	}
}
