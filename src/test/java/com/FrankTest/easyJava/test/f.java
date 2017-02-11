package com.FrankTest.easyJava.test;

import java.util.ArrayList;
import java.util.List;

public class f {

	public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(listToString(list));//aaa,bbb,ccc
    }
     
    public static String listToString(List stringList){
        if (stringList==null) {
            return null;
        }
        StringBuilder result=new StringBuilder();
        boolean flag=false;
        for (Object string : stringList) {
            if (flag) {
                result.append(",");
            }else {
                flag=true;
            }
            result.append(string);
        }
        return result.toString();
    }
}
