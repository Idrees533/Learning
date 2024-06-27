package com.learn.multithread;

public class JoinThread {

	public static void main(String[] args) {
		
		Runnable task=() -> {
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO: handle 
				e.printStackTrace();
			}
			ThreadInformation.print(Thread.currentThread());
		};
		
		Thread t1=new Thread(task,"task-1");
		Thread t2=new Thread(task,"task-2");
		Thread t3=new Thread(task,"task-3");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
		t3.start();
	}
	
	class ThreadInformation {
		static void print(Thread thread) {
			System.out.printf("%s is on [%s] state %n", thread.getName(), thread.getState());
		}
	}
}
