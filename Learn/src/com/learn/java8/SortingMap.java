package com.learn.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// You want to sort the map by scores in descending order.
public class SortingMap {
	public static void main(String[] args) {
		
		Map<String, Integer> studentScores = new HashMap<>();
		studentScores.put("Alice", 85);
		studentScores.put("Bob", 92);
		studentScores.put("Charlie", 78);
		studentScores.put("Dave", 91);
		
		List<Map.Entry<String, Integer>> sortList 	=studentScores.entrySet().stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.collect(Collectors.toList());
		System.out.println(sortList);
	}

}
