package com.FrankTest.easyJava.test.process;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class MyThread extends Thread{  
    public void run(){ 
    	BigInteger i=new BigInteger("0");
		List<BigInteger> list=new ArrayList<BigInteger>();
		while(true){
			if(i.compareTo(new BigInteger("0"))>=0){
				i=i.add(new BigInteger("1"));
				list.add(i);
				System.out.println(this.getId()+"   :"+i);
				
			}
		}
    }  
}  

public class cpuuse {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<10;i++){
			
			MyThread a=	new MyThread();
			a.run();
		}
	}
	

}
