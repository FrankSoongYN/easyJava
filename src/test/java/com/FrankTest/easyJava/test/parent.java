package com.FrankTest.easyJava.test;

public class parent {
	
	public static String name="Parent";
	
	public  parent(){
		System.out.println(this.name);
	}
	
	public  parent(int i){
		System.out.println(this.name);
		System.out.println(i);
	}
	
	public void funA(){
		System.out.println("parent funA");
	}

	public static void funB(){
		System.out.println("parent funB");
	}
}
