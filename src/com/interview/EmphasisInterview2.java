package com.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmphasisInterview2 {

	public static void main(String[] args) {
		
		String str= "Ravi:24;Harish:22;Mounika:23";
		//convert into key and value
		
	Map<String, String>	keyValueMap=Arrays.stream(str.split(";"))
		.map(s->s.split(":"))
		.collect(Collectors.toMap(e->e[0], e->e[1]));
	
	
	
	
	System.out.println(keyValueMap);
	
Map<Object, Object> keyValue=Arrays.stream(str.split(";"))
	.map(s->s.split(":"))
	.collect(Collectors.toMap(k->k[0], k->k[1]));
	
System.out.println(keyValue);
	//.forEach((Map.Entry(k,v)->System.out.println()));
	}
}
