package com.learn.logical;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int []num= {3,0,1,3,5,2,4};
	int missing	=findMissingNumber(num);
	System.out.println("missing number"+missing);
	}

	private static int findMissingNumber(int[] num) {
		// TODO Auto-generated method stub
		int n=num.length;
		//calculate the expected sum of the number 
		int expectSum = n*(n+1)/2;
		//calculate the actual number of the array
		int actualSum=0;
		
		for(int a:num) {
			actualSum+=a;
		}
		
		//find the missing number is 
		// expected nmber minus actual number 
		// 21-18
		return expectSum - actualSum;
		
		
	}
}
