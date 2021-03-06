package com.practise.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {

	public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Executor Service...");
        
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
        System.out.println("Creating a Runnable...");

        Runnable runnable = () -> {
            System.out.println("TAsk: " + Thread.currentThread().getName());
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("TAsk: completed");

        };
        System.out.println("Submit the task specified by the runnable to the executor service.");
         executorService.submit(runnable);
         
         executorService.shutdown();
}
}