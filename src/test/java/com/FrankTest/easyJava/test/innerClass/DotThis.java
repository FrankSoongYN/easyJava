package com.FrankTest.easyJava.test.innerClass;

public class DotThis {
	  void f() { System.out.println("DotThis.f()"); }
	  public class Inner {
	    public DotThis outer() {
	    	System.out.println("33333");
	      return DotThis.this;
	      // A plain "this" would be Inner's "this"
	    }
	  }
	  public Inner inner() { 
		  System.out.println("222222");
		  return new Inner(); 
		  }
	  public static void main(String[] args) {
	    DotThis dt = new DotThis();
	    DotThis.Inner dti = dt.inner();
	    dti.outer().f();
	  }
}
