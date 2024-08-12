package com.example.coforge;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordInStreamApi {
public static void main(String[] args) {
	
	    List<String> list  = Arrays.asList("apple","banana","catch","apple","banana","cat");
	    
	    list.stream()
	    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
	    .stream().forEach(k->System.out.println(k.getKey() + " "+k.getValue()));
	    
}
}
