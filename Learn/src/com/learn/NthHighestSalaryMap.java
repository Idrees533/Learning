package com.learn;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalaryMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("vivek", 100);	
		map.put("Rinku", 400);	
		map.put("vishal", 600);	
		map.put("shankar", 500);	
		map.put("shyam", 500);	
		map.put("tinku", 300);	
		System.out.println(findNthSalary(map,3));
		
		
	}

	private static Map.Entry<Integer, List<String>> findNthSalary(Map<String, Integer> map,int n) {
		// TODO Auto-generated method stub
		return map.entrySet().stream().collect(Collectors.groupingBy(entry->entry.getValue()
				,Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
		.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
		.collect(Collectors.toList()).get(0);
	}
}
