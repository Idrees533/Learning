package com.learn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortedZeroandOnes {

	public static void main(String[] args) {
		Integer array[] = {1,2,0,9,0,5,8,0,4};
		//output : [0,0,1,1,1]
		System.out.println(Arrays.stream(array).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		swaparray(array);
	}

	private static void swaparray(Integer[] array) {
		// TODO Auto-generated method stub
		int left=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				int temp=array[i];
				array[i]=array[left];
				array[left]=temp;
				left++;
				
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
