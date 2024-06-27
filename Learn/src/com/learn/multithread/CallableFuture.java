package com.learn.multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//represent a task that return result
public class CallableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		ExecutorService excutorService=Executors.newSingleThreadExecutor();
		
		//Submit task in the form of callable and obtain future object
			Future<Integer>	futureService=excutorService.submit(new Callable<Integer>() {
				
				@Override
				public Integer call() throws Exception {
					Thread.sleep(1000);
					return 50;
				};
			});
			
		Integer result	=	futureService.get();
		System.out.println(result);
		excutorService.shutdown();
	}
}
