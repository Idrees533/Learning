package com.learn.multithread;

public class ThreadClassTest {
	
	public static void main(String[] args) {
		
		Runnable runnableThread=new RunnableTest();
		Thread thread=new Thread(runnableThread);
		
		RunnableTest.ThreadInformation.print(thread);
		thread.start();
	}

}

class RunnableTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ThreadInformation.print(Thread.currentThread());
	}
	class ThreadInformation {
		public static void print(Thread thread) {
			System.out.println("-------------------------------");
			System.out.println("Thread Name :: "+thread.getName());
			System.out.println(" thread state :: "+thread.getState());
			System.out.println("thread group :: "+thread.getThreadGroup());
		}
	}
	
}


