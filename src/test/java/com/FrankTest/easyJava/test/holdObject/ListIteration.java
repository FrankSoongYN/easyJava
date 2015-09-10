package com.FrankTest.easyJava.test.holdObject;

import java.util.List;

import com.FrankTest.easyJava.test.typeInfo.Hamster;
import com.FrankTest.easyJava.test.typeInfo.Pet;
import com.FrankTest.easyJava.test.typeInfo.Pets;
import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class ListIteration {
	  public static void main(String[] args) {
	    List<Pet> pets = Pets.arrayList(8);
	    java.util.ListIterator<Pet> it = pets.listIterator();
	    while(it.hasNext())
	      System.out.print(it.next() + ", " + it.nextIndex() +
	        ", " + it.previousIndex() + "; ");
	    System.out.println();
	    // Backwards:
	    while(it.hasPrevious())
	      System.out.print(it.previous().id() + " ");
	    System.out.println();
	    System.out.println(pets);	
	    it = pets.listIterator(3);
	    while(it.hasNext()) {
	      it.next();
	     // it.set(Pets.randomPet());
	      it.set(new Hamster());
	    }
	    System.out.println(pets);
	  }
	}
