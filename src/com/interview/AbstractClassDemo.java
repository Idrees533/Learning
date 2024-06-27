package com.interview;

abstract class AbstractClass {
abstract void m1();
	
void m2() {
	System.out.println("m2");
}
}
 
 public class AbstractClassDemo extends AbstractClass {
public static void main(String[] args) {
	//can not create the object of abstract clas
	//In abstract class have constructor
	
	//AbstractClass ob=new AbstractClass();
	
	AbstractClass obj=new AbstractClassDemo(); //can not instatiate the abstract class obj
	obj.m1();
	obj.m2();
		
}
	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("Defne m1 in ");
	}
	
	 
 }
