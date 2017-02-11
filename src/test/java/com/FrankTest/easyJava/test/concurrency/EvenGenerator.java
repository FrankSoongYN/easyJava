//: concurrency/EvenGenerator.java
package com.FrankTest.easyJava.test.concurrency; /* Added by Eclipse.py */
// When threads collide.

public class EvenGenerator extends IntGenerator {
  private int currentEvenValue = 0;
  public int next() {
    ++currentEvenValue; // Danger point here!
    Thread.yield();
    System.out.println(Thread.currentThread().toString()+ currentEvenValue);
    ++currentEvenValue;
    return currentEvenValue;
  }
  public static void main(String[] args) {
    EvenChecker.test(new EvenGenerator());
  }
} /* Output: (Sample)
Press Control-C to exit
89476993 not even!
89476993 not even!
*///:~
