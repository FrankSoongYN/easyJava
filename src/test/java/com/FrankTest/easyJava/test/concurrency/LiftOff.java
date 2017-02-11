//: concurrency/LiftOff.java
package com.FrankTest.easyJava.test.concurrency; /* Added by Eclipse.py */
// Demonstration of the Runnable interface.

public class LiftOff implements Runnable {
  protected int countDown = 10; // Default
  private static int taskCount = 0;
  private final int id = taskCount++;
  public LiftOff() {}
  public LiftOff(int countDown) {
    this.countDown = countDown;
  }
  public String status() {
    return "#" + id + "(" +
      (countDown > 0 ? countDown : "Liftoff!") + "), ";
  }
  public void run() {
    while(countDown-- > 0) {
      System.out.print(status());
      //Thread.yield();
//      try {
//		Thread.sleep(100);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
    }
  }
  
  public static void main(String[] args) {
	  for(int i=0;i<2;i++){
		  Thread a=new Thread(new LiftOff());
		  a.start();
	  }
	
}
} ///:~
