package com.FrankTest.easyJava.test;

import java.math.BigDecimal;

public class b {
	
	public static void main(String[] args) {
		BigDecimal a=new BigDecimal("0.5");
		System.out.println(a.compareTo(new BigDecimal("0"))>0);
	}

}
