package com.interview;

interface T1 {
	void m1();
	default void m2() {
		System.out.println("default method of T1");
	}
}

interface T2  {
	void m1();
	default void m23() {
		System.out.println("default method of T2");
	}
}
//Duplicate default methods named m2 with the parameters () and () 
//are inherited from the types T2 and T1

public class ImplementTwoInterface implements T1,T2 {

	public static void main(String[] args) {
			ImplementTwoInterface obj=new ImplementTwoInterface();
			obj.m1();
			obj.m2();
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("From T1");
	}
	

	
	
}
