package com.code.interview.publicisapient;

public class SingletonMultiThreadEnvironment {
	//instance variable declared as volatile to ensure that changes its value always visible to other
		//threads
	//its just like a notification to other thread if this variable changes it's update to other thread
	//it's used in like single writer and multiple reader
	private static volatile SingletonMultiThreadEnvironment instance;
	
	
	//private constructor to restrict the instantiation from outside of the class
	//put the restriction from outside of the class 
	//doesn't allow instantiate object from outside of the class
	private SingletonMultiThreadEnvironment() {}
	
	public static SingletonMultiThreadEnvironment getInstance() {
		
		if(instance==null) {
			
			//synchronized block  we check the again if the instance is null or not
			synchronized(SingletonMultiThreadEnvironment.class) {
				if(instance==null) {
				instance=new SingletonMultiThreadEnvironment();
			}
		} 
	}
		return instance;
}
	
	
}
