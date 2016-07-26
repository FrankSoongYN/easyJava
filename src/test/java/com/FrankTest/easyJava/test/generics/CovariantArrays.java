package com.FrankTest.easyJava.test.generics;

//: generics/CovariantArrays.java

class Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}
class Orange extends Fruit {}

public class CovariantArrays {
public static void main(String[] args) {
  Fruit[] fruit = new Apple[10];
  fruit[0] = new Apple(); // OK
  fruit[1] = new Jonathan(); // OK
  // Runtime type is Apple[], not Fruit[] or Orange[]:
  try {
    // Compiler allows you to add Fruit:
    fruit[0] = new Fruit(); // ArrayStoreException
  } catch(Exception e) { 
	  System.out.println(e);
	  e.printStackTrace();
	  }
  try {
    // Compiler allows you to add Oranges:
    fruit[1] = new Orange(); // ArrayStoreException
  } catch(Exception e) { 
	  System.out.println(e);
	  e.printStackTrace();
	  }
}
} /* Output:
java.lang.ArrayStoreException: Fruit
java.lang.ArrayStoreException: Orange
*///:~
