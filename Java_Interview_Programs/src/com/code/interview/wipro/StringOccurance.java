package com.code.interview.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurance {

	public static void main(String[] args) {
		String str[]= {"a","b","c","a","d"};
		
		Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().forEach(e->System.out.println("("+e.getKey()+","+e.getValue()+")"));
		
		
		System.out.println("-------------------");
		//another way.
		List<String> listOfLists =
                Arrays.asList("a", "b", "c", "a", "a", "d", "e");
		listOfLists.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().forEach(e->System.out.println("("+e.getKey()+","+e.getValue()+")"));
		
	}
}
