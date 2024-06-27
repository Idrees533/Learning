package com.learn.exception;

class Parent {
	Parent() throws  RuntimeException {
		System.out.println("Parent");
	}
}
class Child extends Parent {
	Child() throws Exception{
		System.out.println("Child Excpeiton");
	}
}
//It will be allowed if the Parent class throwing the RuntimeException and child throwing the Exception 
// It will not be allow if the Parent throwing the Exception but Child throwing Runtime Exception


public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		
	}
}
