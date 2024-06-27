package com.interview;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;


//First repeated character 
public class DeloitteInterviewFirstRepeatedCharact {

	public static void main(String[] args) {
			
		String input = "java interview is in progress";
					
	Character repeatChar=input.chars().mapToObj(s->(char)s)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream()
		.filter(e->e.getValue()  > 1L)
		.map(e->e.getKey())
		.findFirst()
		.get();
	
	System.out.println(repeatChar);
	}
}
