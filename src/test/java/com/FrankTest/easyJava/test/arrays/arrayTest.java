package com.FrankTest.easyJava.test.arrays;

import java.util.Arrays;

public class arrayTest {
	public static void output(int[] array) {
		if (array!=null) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array = new int[5];
		//填充数组
		Arrays.fill(array, 5);
		System.out.println("填充数组：Arrays.fill(array, 5)：");
		arrayTest.output(array);

		//将数组的第2和第3个元素赋值为8
		Arrays.fill(array, 2, 3, 8);
		System.out.println("将数组的第2和第3个元素赋值为8：Arrays.fill(array, 2, 4, 8)：");
		arrayTest.output(array);

		int[] array1 = {7,8,3,2,12,6,3,5,4};
		//对数组的第2个到第6个进行排序进行排序
		Arrays.sort(array1,2,7);
		System.out.println("对数组的第2个到第6个元素进行排序进行排序：Arrays.sort(array,2,7)：");
		arrayTest.output(array1);

		//对整个数组进行排序
		Arrays.sort(array1);
		System.out.println("对整个数组进行排序：Arrays.sort(array1)：");
		arrayTest.output(array1);

		//比较数组元素是否相等
		System.out.println("比较数组元素是否相等:Arrays.equals(array, array1):"+"\n"+Arrays.equals(array, array1));
		int[] array2 = array1.clone();
		System.out.println("克隆后数组元素是否相等:Arrays.equals(array1, array2):"+"\n"+Arrays.equals(array1, array2));

		//使用二分搜索算法查找指定元素所在的下标（必须是排序好的，否则结果不正确）
		Arrays.sort(array1);
		System.out.println("元素3在array1中的位置：Arrays.binarySearch(array1, 3)："+"\n"+Arrays.binarySearch(array1, 3));
		//如果不存在就返回负数
		System.out.println("元素9在array1中的位置：Arrays.binarySearch(array1, 9)："+"\n"+Arrays.binarySearch(array1, 9));
	
		
		int b[] = new int[10]; 
		Class clazz1 = b.getClass();   
		System.out.println(clazz1.getName());  
		
		System.out.println("\r\n");
		int a[] = new int[10]; 
		Class clazz = a.getClass();   
		System.out.println(clazz.getDeclaredFields().length);   
		System.out.println(clazz.getDeclaredMethods().length);   
		System.out.println(clazz.getDeclaredConstructors().length);   
		System.out.println(clazz.getDeclaredAnnotations().length);   
		System.out.println(clazz.getDeclaredClasses().length);   
		System.out.println(clazz.getSuperclass()); 
		
	}
}
