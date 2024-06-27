package com.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Capgmini_String_Non_Repeat_Charcter {

	public static void main(String[] args) {
		
		String s[]= {"applee","banana","catt"};
				
						//s.split(s)
						/*
						 * Arrays.stream(s.toString().split(","))
						 * .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
						 * Collectors.counting()))
						 * .entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.
						 * getKey()) .forEach(System.out::println);
						 */
					
						/*
						 * .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
						 * Collectors.counting()))
						 * .entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.
						 * getKey()) .forEach(System.out::println);
						 */
					
			List<String> list=	Arrays.stream(s).flatMap(str->Arrays.stream(str.split("")))
						.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
						.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey())
						.collect(Collectors.toList());
			
								
	}
}
