package com.code.interview.nineleaps;

import java.util.ArrayList;
import java.util.HashMap;

public class SumOfTwoArrayIsTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,2,3,4,5,6,7,8};
			int target=9;
			
			HashMap map=new HashMap();
			ArrayList result=new ArrayList();
			
			for(int num:arr) {
				int complement=target-num;
			if(map.containsKey(complement)) {
				result.add(complement);
				result.add(num);
			}
			map.put(num, complement);
			}
			
		System.out.println(result);
	}

}
