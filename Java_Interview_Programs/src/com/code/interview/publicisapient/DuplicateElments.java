package com.code.interview.publicisapient;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElments {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,1,3,2,5,3,7,6,5);
		
		//find the duplicate number and count how many times duplicate numbers 
		
		list.stream()
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(k->k.getValue() > 1)
		.forEach(k->System.out.println(k.getKey() +" = "+k.getValue()));
	}
}
