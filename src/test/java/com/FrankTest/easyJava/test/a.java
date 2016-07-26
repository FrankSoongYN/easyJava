package com.FrankTest.easyJava.test;

import java.util.ArrayList;

public class a {

	
	public static void main(String[] args) {
		String a="A00300";
		String [] as=a.split("A00");
		for(String b:as){
			System.out.println(b);
		}
		
		ArrayList<Integer> list =new ArrayList<Integer>();
		for(Integer c :list){
			System.out.println(c);
		}
		
	}
}
