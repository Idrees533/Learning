package com.learn.logical;

public class Fibonazzi {

	public static void main(String[] args) {
		int n=5;
	int Fnumber	=findNthFibonacci(n);
	System.out.println(Fnumber);
	}

	private static int findNthFibonacci(int n) {
		// TODO Auto-generated method stub
		if(n <=1) {
			return n;
		}
		
		
		return findNthFibonacci(n-1)+findNthFibonacci(n-2);		
	}
}
