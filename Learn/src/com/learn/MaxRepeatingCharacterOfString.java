package com.learn;

import java.util.HashSet;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxRepeatingCharacterOfString {

	public static void main(String[] args) {
		String s="jjaavvavfv";
		
		
	Character c	=s.chars()
	      .mapToObj(x ->(char) x)
	      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	      .entrySet().stream()
	     .max(Map.Entry.comparingByValue())
	     .map(Map.Entry::getKey)
	     .get();
	System.out.println(c);
	      


	}
}
