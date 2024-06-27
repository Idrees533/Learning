package com.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		
		String [] str= {"abc","abc","xyz"};
		Map<String, Long> result=Arrays.stream(str)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(k->k.getValue() > 1)
				.collect(Collectors.toMap(Entry::getKey,Entry::getValue));
					
		
		System.out.println("Result "+result);
	}
}
