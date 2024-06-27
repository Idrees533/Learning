package com.learn;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionStream_findDuplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="mohammedidrees";
			System.out.println(findDuplicates(str));
	}

	private static Map<String, Long> findDuplicates(String str) {
		// TODO Auto-generated method stub
		return Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(p->p.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}

}
