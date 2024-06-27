package com.learn;

public class LazySingletonClass {

	public static LazySingletonClass instance;
	
	private LazySingletonClass() {
	
	}
	
	public static LazySingletonClass getInstance() {
		if(instance==null) {
			instance=new LazySingletonClass();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		LazySingletonClass obj=new LazySingletonClass();
		LazySingletonClass ob2=new LazySingletonClass();
		System.out.println(obj.getInstance()==ob2.getInstance());
		System.out.println(obj.getInstance().equals(ob2.getInstance()));
		System.out.println(obj.getInstance().hashCode()==ob2.hashCode());
	}
}
