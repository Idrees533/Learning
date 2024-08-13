package com.code.interview.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToLength {

	public static void main(String[] args) {
		List<String> strList=Arrays.asList("hello","world","java");
		
	List<Integer> lenList=strList.stream()
		.map(String::length)
		.collect(Collectors.toList());
	
	System.out.println(lenList);
	}
}
