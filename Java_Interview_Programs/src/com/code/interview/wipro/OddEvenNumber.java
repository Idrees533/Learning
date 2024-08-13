package com.code.interview.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//find the even and odd number using java8 lambda expression
public class OddEvenNumber {

	public static void main(String[] args) {
	
		List<Integer> number=Arrays.asList(1,3,2,4,5,6,7);
		
		Map <Boolean, List <Integer>> partitionNumber=number.stream()
				.collect(Collectors.partitioningBy(p->p%2==0));
		List<Integer> evenNumber=partitionNumber.get(true);
		List<Integer> oddNumber=partitionNumber.get(false);
		
		System.out.println("Odd Numbers : "+oddNumber);
		System.out.println("Even Number ;"+evenNumber);
		
	}
}
