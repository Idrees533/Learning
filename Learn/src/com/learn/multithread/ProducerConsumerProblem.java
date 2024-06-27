package com.learn.multithread;

import java.util.ArrayList;
import java.util.List;

class SharedQueue<T> {
	private final int MAX_BUFFER_SIZE;
    private final List<T> buffer;
    
    SharedQueue() {
    	this(10);
    }
    SharedQueue(int size) {
    	MAX_BUFFER_SIZE=size;
    	buffer=new ArrayList<>(MAX_BUFFER_SIZE);
    }
    
    public synchronized void produce(T t) throws InterruptedException {
    	
    	if(buffer.size()==MAX_BUFFER_SIZE) {
    		System.out.println(Thread.currentThread().getName()+"Buffer is Full is going to waiting state");
    	wait();
    	}
    	buffer.add(t);
    	System.out.println(Thread.currentThread().getName()+"Produced Element ");
    	notify();
    }
    
    
    public synchronized T consume() throws InterruptedException {
    	if(buffer.size()==0) {
    		System.out.println(Thread.currentThread().getName()+"Buffer is empty into wait state");
    		wait();
    	}
    	T t=buffer.remove(0);
    	System.out.println("Consumed element");
    	
    	notify();
    	return t;
    }
    
}
public class ProducerConsumerProblem {
	private static final SharedQueue<Integer> sharedQueue=new SharedQueue<>(10);
	
	public static void main(String[] args) throws InterruptedException {
	
		//creating the producer thread
		Runnable producerTask=() -> {
			
			int i=0;
			while(true) 	{
				try {
					//sharing the resource where we are producing the resource
					sharedQueue.produce(++i);
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		};
		
Runnable consumerTask=() -> {
			
			int i=0;
			while(true) 	{
				try {
					sharedQueue.consume();
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		};
		
		Thread pThread=new Thread(producerTask, "Producer");
		Thread cThread=new Thread(consumerTask,"consumer");
		
		pThread.start();
		cThread.start();
		
		pThread.join();
		cThread.join();
		
	}
}
