package com.example.coforge;

public class SingletonClass {

	private static volatile SingletonClass instance;
// preventing external instantiation, you ensure that only one instance of the class is created
	//and provide a global point of access to that instance	
	
	private SingletonClass()  {
		
	}
	
	public static SingletonClass getInstance() {
		if(instance==null) {
			synchronized (SingletonClass.class) {
				
				if(instance==null) {
					instance=new SingletonClass();
				}
			}
			
		}
		return instance;
	}
}
