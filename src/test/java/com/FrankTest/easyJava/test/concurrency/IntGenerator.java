//: concurrency/IntGenerator.java
package com.FrankTest.easyJava.test.concurrency; /* Added by Eclipse.py */

public abstract class IntGenerator {
  private volatile boolean canceled = false;
  public abstract int next();
  // Allow this to be canceled:
  public void cancel() { canceled = true; }
  public boolean isCanceled() { return canceled; }
} ///:~
