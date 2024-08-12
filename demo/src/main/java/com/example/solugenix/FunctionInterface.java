package com.example.solugenix;

interface genix {
	 int sum(int a,int b);
	//void test();
}

public class FunctionInterface {

	public static void main(String[] args) {
	
		genix d= (int a, int b)-> 
				// TODO Auto-generated method stub
				 a+b;
	    
			System.out.println(d.sum(5, 10));
		
	}
}
