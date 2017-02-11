package com.FrankTest.easyJava.test.concurrency;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class TaskResult implements Callable<String> {
	private int id;
	  public TaskResult(int id) {
		if(id%2==0){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 可能做一些事情
		}
	    this.id = id;
	  }
	  public String call() {
		int random=new Random().nextInt(100);
	    return "result of TaskWithResult " + id+"    :"+random;
	  }
}

public class CallableAndFuture {
	 public static void main(String[] args) {
		 ExecutorService exec = Executors.newCachedThreadPool();
		 ArrayList<Future<String>> results =
			      new ArrayList<Future<String>>();
		 for(int i = 0; i < 10; i++)
		      results.add(exec.submit(new TaskResult(i)));
		 for(Future<String> fs : results)
	        try {
	            System.out.println(fs.get());
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } catch (ExecutionException e) {
	            e.printStackTrace();
	        }
	    }
}
