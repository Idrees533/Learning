package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionListElement {
	
	public static void main(String[] args) {
		//you have a list of numbers, and 
		//you want to partition them into odd and even numbers.
			List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
					Map<Boolean, List<Integer>> oddEvenNumber=numbers.stream()
							.collect(Collectors.partitioningBy(n->n%2==0));
					System.out.println("Odd Even Number"+oddEvenNumber);
	}

}
