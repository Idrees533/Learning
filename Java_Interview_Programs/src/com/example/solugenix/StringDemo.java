package com.example.solugenix;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//anagram 

public class StringDemo {

	public static void main(String[] args) {
	
	    List<String>list=Arrays.asList("apple","umbrella","apple","ball","apple","ball");
	    
	   list.stream()
	    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	    .entrySet().forEach(k->System.out.println(k.getKey() + " ="+k.getValue()));
	    
		
	    
	
	}
}
