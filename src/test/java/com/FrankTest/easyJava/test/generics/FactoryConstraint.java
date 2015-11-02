package com.FrankTest.easyJava.test.generics;

interface FactoryI<T> {
	  T create();
	}

	class Foo2<T> {
	  private T x;
	  public <F extends FactoryI<T>> Foo2(F factory) {
	    x = factory.create();
	  }
	  // ...
	}

	class IntegerFactory implements FactoryI<Integer> {
	  public Integer create() {
		  System.out.println("integer is instance");
	    return new Integer(0);
	  }
	}	

	class Widget {
	  public static class Factory implements FactoryI<Widget> {
	    public Widget create() {
	    	System.out.println("Widget is instance");
	      return new Widget();
	    }
	  }
	}

	public class FactoryConstraint {
	  public static void main(String[] args) {
	    new Foo2<Integer>(new IntegerFactory());
	    new Foo2<Widget>(new Widget.Factory());
	  }
	} 
