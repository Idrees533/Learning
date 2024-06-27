package com.interview;

class Parent2 {
	 Parent2(String s) {
		System.out.println("Parent method  "+s);
	}
}
class Child2 extends Parent2{
//when ever child constructor call the parent constructor as well
	//first parent default constructor will be called then child default constuctor
	 Child2(String s) {
		 super(s);
		System.out.println("Child mehthd");
		
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		//Parent p=new Parent();
		Child2 c=new Child2("hi");
	}
}
