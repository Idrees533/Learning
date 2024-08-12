package com.example.caspux;


import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
	int arr[]={10, 30, 20, 10, 30, 10};
	
	Arrays.stream(arr).boxed()
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
	.stream().forEach(k->System.out.println(k.getKey() + " = "+k.getValue()));
	}
	
}
