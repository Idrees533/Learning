package com.code.interview.genpact;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNon_RepeatCharacter {

	public static void main(String[] args) {
		String s="aabbcdde";
		
		//find the first non-repeatign character
		
	Character  e=s.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(f->f.getValue()==1)
		.map(Map.Entry::getKey).findFirst().get();
	
	System.out.println(e); 
	
	}
}
