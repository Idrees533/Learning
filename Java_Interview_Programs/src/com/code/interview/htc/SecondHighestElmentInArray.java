package com.code.interview.htc;

public class SecondHighestElmentInArray {

	public static void main(String[] args) {
		int arr[]= {1,3,5,9,19,16,23};
		 int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			
			//checking the first condition if index value 0 is greater than 
			//shif the right side
			//swapping the value 
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		
		System.out.println(arr[7-2]);
	}
}
