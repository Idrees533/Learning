package com.learn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionStream_findDuplicates {

	public static void main(String[] args) {
		String input="mohammed idrees";
						
		List<String>duplicateCharacter=findDuplicates(input);
		System.out.println("Duplicate Charachter: "+duplicateCharacter);
	}

	private static List<String> findDuplicates(String input) {
		// TODO Auto-generated method stub
		
		return Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(ch->ch.getValue() > 1)
				.map(out->out.getKey())
				.collect(Collectors.toList());
	}
}
