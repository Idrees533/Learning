package com.interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EmphasisInterview {

	public static void main(String[] args) {
		//
		Map<String,Integer> map = new HashMap<>();
		map.put("Banana",4);
		map.put("Apple",9);
		map.put("Grapes",3);
		map.put("Mangoes",5);
		
		//sort the map using value in java stream
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
}
