package com.code.interview.euclidinnovations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/*@FunctionalInterface
interface GetKeyFunction {
    String apply(Map.Entry<String, Integer> entry);
}

@FunctionalInterface
interface GetValueFunction {
    Integer apply(Map.Entry<String, Integer> entry);
}*/
public class SortedMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Ronaldo", 21);

		map.put("Messi", 17);

		map.put("Neymar", 20);
		
				// TODO Auto-generated method stub
				 
				/*
				 * GetKeyFunction getKey=( entry) -> entry.getKey();
				 * 
				 * GetValueFunction getValue=( entry) -> entry.getValue();
				 */
			
		
	

		Map<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		//Map.Entry.comparingByValue() return the comparator
		
		/*
		 * map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		 * .collect(Collectors.toMap(null, null, null))
		 */

		System.out.println(sortedMap);
	}
}
