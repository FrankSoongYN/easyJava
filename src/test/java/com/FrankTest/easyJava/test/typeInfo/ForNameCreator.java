//: typeinfo/pets/ForNameCreator.java
package com.FrankTest.easyJava.test.typeInfo;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "com.FrankTest.easyJava.test.typeInfo.Mutt",
    "com.FrankTest.easyJava.test.typeInfo.Pug",
    "com.FrankTest.easyJava.test.typeInfo.EgyptianMau",
    "com.FrankTest.easyJava.test.typeInfo.Manx",
    "com.FrankTest.easyJava.test.typeInfo.Cymric",
    "com.FrankTest.easyJava.test.typeInfo.Rat",
    "com.FrankTest.easyJava.test.typeInfo.Mouse",
    "com.FrankTest.easyJava.test.typeInfo.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
