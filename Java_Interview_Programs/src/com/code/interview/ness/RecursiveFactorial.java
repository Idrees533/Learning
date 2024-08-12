package com.code.interview.ness;

public class RecursiveFactorial {

	public static void main(String[] args) {
		int n=5;
		int factorial=factorianNumber(n);
		System.out.println(factorial);
	}

	private static int factorianNumber(int n) {
		// TODO Auto-generated method stub
		
		if(n >=1) {
		return	n*factorianNumber(n-1);
		} else {
		return 1;
		}
	}
}
