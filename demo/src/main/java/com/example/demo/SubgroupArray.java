package com.example.demo;

public class SubgroupArray {

	public static void main(String[] args) {
		
		//Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], K = 3 
				//Output: 3, 2, 1, 6, 5, 4, 9, 8, 7
		int arr[]=  {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int k=3;
		
		reverseArrayKElement(arr,k);
			printArray(arr);
		
		}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int n:arr) {
			System.out.print(+n+"" );
		}
	}

	private static void reverseArrayKElement(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++) {
			int left=i;
			int right=Math.min(i+k-1, arr.length-1);  
			
			//initial start process
			while(left < right) {
			int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
				
		}
	}
}
}
