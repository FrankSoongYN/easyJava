package com.FrankTest.easyJava.test.typeInfo;

public class GenericClassReferences {
	  public static void main(String[] args) {
	    Class intClass = int.class;
	    Class<? extends Number> genericIntClass = int.class;
	    genericIntClass = Integer.class; // Same thing
	    intClass = double.class;
	    genericIntClass = double.class; // Illegal
	   // genericIntClass=String.class;
	  }
	}
