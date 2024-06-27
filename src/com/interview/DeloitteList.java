package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
//Find the duplicate integer in List
public class DeloitteList {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		//find the duplicate integer list
				HashSet set=new HashSet();
				List duplicateList=myList.stream().filter(s->!set.add(s)).collect(Collectors.toList());
				
				System.out.println(duplicateList);
	}
}
