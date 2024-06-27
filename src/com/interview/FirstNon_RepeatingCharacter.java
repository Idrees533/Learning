package com.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNon_RepeatingCharacter {

	public static void main(String[] args) {
		
		String str="aabbccdeff";
		
					str.chars().mapToObj(c->(char)c)
					.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
					.entrySet()
					.stream()
					.filter(p->p.getValue() > 1)
					.forEach((k)->System.out.println(k.getKey() + " "+k.getValue()));
					
	}
}
