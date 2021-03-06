package com.FrankTest.easyJava.test.holdObject;

import java.util.LinkedList;

import com.FrankTest.easyJava.test.typeInfo.Cat;
import com.FrankTest.easyJava.test.typeInfo.Hamster;
import com.FrankTest.easyJava.test.typeInfo.Pet;
import com.FrankTest.easyJava.test.typeInfo.Pets;
import com.FrankTest.easyJava.test.typeInfo.Rat;

public class LinkedListFeatures {
	  public static void main(String[] args) {
	    LinkedList<Pet> pets =
	      new LinkedList<Pet>(Pets.arrayList(5));
	    System.out.println(pets);
	    // Identical:
	    System.out.println("pets.getFirst(): " + pets.getFirst());
	    System.out.println("pets.element(): " + pets.element());
	    // Only differs in empty-list behavior:
	    System.out.println("pets.peek(): " + pets.peek());
	    // Identical; remove and return the first element:
	    System.out.println("pets.remove(): " + pets.remove());
	    System.out.println("pets.removeFirst(): " + pets.removeFirst());
	    // Only differs in empty-list behavior:
	    System.out.println("pets.poll(): " + pets.poll());
	    System.out.println(pets);
	    pets.addFirst(new Rat());
	    System.out.println("After addFirst(): " + pets);
	    pets.offer(Pets.randomPet());
	    System.out.println("After offer(): " + pets);
	    pets.add(Pets.randomPet());
	    System.out.println("After add(): " + pets);
	    pets.addLast(new Hamster());
	    System.out.println("After addLast(): " + pets);
	    System.out.println("pets.removeLast(): " + pets.removeLast());
	    pets.add(3, new Cat());
	    System.out.println(pets);
	  }
	}
