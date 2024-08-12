package com.code.interview.nineleaps;
interface i1 {
	 abstract  void m1();
	static void m2() {
		System.out.println("I am default m2");
	}
}
interface i2 {
	void m1();
	static void m2() {
		System.out.println("I am default m2");
	}
}

public class MultipleInterface implements i1,i2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterface obj=new MultipleInterface();
		obj.m1();
		obj.m2();
	}

	

	@Override
	public void m1() {
		// TODO Auto-generated method stub
	System.out.println("Interface allow if the same method declared in both interfaces ");	
	}

//Duplicate default methods named m2 with the parameters () and () are
	//inherited from the types i2 and i1
	//Override the method if the default define in function interface

	public void m2() {
		// TODO Auto-generated method stub
		
	}



	


	
}
