package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LogicStream {

	public static void main(String[] args) {
		//System.out.println("hellow world");
		
		List<Integer> l= Arrays.asList(10,120,50);
		List<Integer> modList=l.stream().map(n->n > 100 ? n * 2 :n).collect(Collectors.toList());
				System.out.println(modList);
				
		// 2nd approach
		
		List<Integer> otherList=l.stream().filter(n->n > 100).map(n-> n* 2).collect(Collectors.toList());
				System.out.println("other approach : "+otherList);
	}
}
