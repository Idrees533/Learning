package com.learn.multithread;

class Counter {
	int count=1;
	
	public synchronized void  increment() {
		++count;
	}
	
	public int get() {
		return count;
	}
}

public class SynchroniseIssue {
	
	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		
		Runnable task= () ->  {
			for(int i=0;i<=100;i++) {
				c.increment();
			}
		};
		
		Thread t1=new Thread(task, "task-1");
		Thread t2=new Thread(task,"task-2");
		Thread t3=new Thread(task,"task-3");
		t1.start();
		t2.start();
		t3.start();
		//wait for threads to complete
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Value of count --"+c.get());
		
	}
	
}
