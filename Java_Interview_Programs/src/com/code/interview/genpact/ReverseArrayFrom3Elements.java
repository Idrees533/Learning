package com.code.interview.genpact;

public class ReverseArrayFrom3Elements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int k=3;
		//output: {3,2,1,6,5,4,9,8,7}
		
		reverseArray(arr,k);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}

	private static void reverseArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i=i+k) {
		int left=i;
		int right=Math.min(i+k-1, arr.length-1);
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
				
	}
  }	
}
