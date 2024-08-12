package com.example.coforge;

public class CreateThreadUsingJava8 {

	public static void main(String[] args) {
		
		Runnable run= ()-> {
				// TODO Auto-generated method stub
			String threadName=Thread.currentThread().getName();
			System.out.println("Running Thread task by : "+threadName);
			};
			
			Thread thread=new Thread(run);
			thread.start();
	}
}
