package com.interview;


class parent {
	
	public void m1() throws  RuntimeException{
		System.out.println("Parent Exccption");
	}
}
class child extends parent {
	
	@Override 
		public void m1() throws ArithmeticException {
		System.out.println("Child Exception");
	}
}
public class ExceptionThrowing {
//Parent to child inheriting 
	//child Exception can throw ChildException (Runtimeexcpeiton(NullPointerException,Arthiamtic to Exception class
//Exception to Parent class throwing RuntimeException not allow not comptable

}
