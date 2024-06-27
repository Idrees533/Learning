package com.learn;

public class EagerSingletonClass {

	public static EagerSingletonClass instance=new EagerSingletonClass();
	
	//private constuctor
	
	private EagerSingletonClass() {
		
	}
	
	//static getinstance
	
	public static EagerSingletonClass getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		
		EagerSingletonClass obj=new EagerSingletonClass();
		EagerSingletonClass obj2=new EagerSingletonClass();
		
		System.err.println(obj.getInstance().equals(obj2.getInstance()));
	}
}
