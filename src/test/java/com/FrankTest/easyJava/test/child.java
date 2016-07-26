package com.FrankTest.easyJava.test;

public class child extends parent {

public static String name="child";
	

	public child(){
		System.out.println(this.name);
	}
	
	public child(int i){
		System.out.println(this.name);
		System.out.println(i);
	}
	
	public void funA(){
		System.out.println("child funA");
	}

	public static void funB(){
		System.out.println("child funB");
	}
	
	public static void main(String[] args) {
		parent p= new child(2015);
		p.funA();
		p.funB();
		System.out.println(p.name);
	}
	
}
