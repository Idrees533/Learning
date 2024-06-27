package com.learn;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNon_RepeatElement {

	public static void main(String[] args) {
		String str="iloveprogramming";
		//find the firstNon_Repeat 
		
		System.out.println(findFirstNon_RepeatElement(str));
		
		Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey())
		.findFirst().get();
	}

	private static String findFirstNon_RepeatElement(String str) {
		// TODO Auto-generated method stub
		return Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey())
				.findFirst().get();
	}
}
