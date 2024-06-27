package com.learn;

public class ThreadSafeSingletonClass {

	public static ThreadSafeSingletonClass instance;
	
	private ThreadSafeSingletonClass() {
		
	}
	
	public static synchronized ThreadSafeSingletonClass getInstance() {
		if(instance==null) {
			instance=new ThreadSafeSingletonClass();
			
		}
		return instance;
	}
	public static void main(String[] args) {
		
	
		ThreadSafeSingletonClass obj=new ThreadSafeSingletonClass();
		ThreadSafeSingletonClass ob2=new ThreadSafeSingletonClass();
	System.out.println(obj.getInstance()==ob2.getInstance());
	System.out.println(obj.getInstance().equals(ob2.getInstance()));
	System.out.println(obj.getInstance().hashCode()==ob2.hashCode());
}
}
