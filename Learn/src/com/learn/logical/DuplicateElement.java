package com.learn.logical;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3};
		
		Set<Integer> set=new HashSet<Integer>();
		
		boolean duplicate=false;
		for(int n:nums) {
			//condition if the have duplicate it allowed 
			if(!set.add(n)) {
				duplicate=true;
				break;
			}
		}
		
		if(duplicate) {
			System.out.println("duplicate found");
		} else {
			System.out.println("duplicate not found");
		}
	}

}
