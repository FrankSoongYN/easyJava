package com.FrankTest.easyJava.test.typeInfo;

import java.lang.reflect.Method;
import java.util.Random;

class Initable {
	  static final int staticFinal = 47;
	  static final int staticFinal2 =
	    ClassInitialization.rand.nextInt(1000);
	  static {
	    System.out.println("Initializing Initable");
	  }
	  public void print(){
		  System.out.println("1111111");
	  }
	}

	class Initable2 {
	  static int staticNonFinal = 147;
	  static {
	    System.out.println("Initializing Initable2");
	  }
	}

	class Initable3 {
	  static int staticNonFinal = 74;
	  static {
	    System.out.println("Initializing Initable3");
	  }
	}

	public class ClassInitialization {
	  public static Random rand = new Random(47);
	  public static void main(String[] args) throws Exception {
	    Class initable = Initable.class;
	    System.out.println("After creating Initable ref");
	    // Does not trigger initialization:
	    System.out.println(Initable.staticFinal);
	    // Does trigger initialization:
	    System.out.println(Initable.staticFinal2);
	    // Does trigger initialization:
	    System.out.println(Initable2.staticNonFinal);
	    //Class initable3 = Class.forName("com.FrankTest.easyJava.test.typeInfo.Initable3");
	    Class initable3 = Class.forName(Initable3.class.getName());
	    System.out.println("After creating Initable3 ref");
	    System.out.println(Initable3.staticNonFinal);
	  }
	}