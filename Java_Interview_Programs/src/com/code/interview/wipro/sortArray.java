package com.code.interview.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortArray {

	public static void main(String[] args) {
		int []arr= {2,1,6,4,3,5};
		
		
		
	int sortedArray[]	=sortArrayMethod(arr);
	for(int i:sortedArray) {
		System.out.print(i +" ");
	}
List<String> list=Arrays.asList("bubble","cat","apple")	;
List<String> sortedList=list.stream().sorted().collect(Collectors.toList());
System.out.println("String sorted:"+sortedList);
	  
	}

	private static int[] sortArrayMethod(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i] > arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		return arr;
		
	}
}
