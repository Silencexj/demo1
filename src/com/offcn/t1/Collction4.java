package com.offcn.t1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Collction4 {

	public static void main(String[] args) {
		Collection list=new ArrayList();
		list.add("计算机网络");
		list.add("现代操作系统");
		list.add("java编程思想");
		list.add("java核心技术");
		list.add("java语言程序设计");
		Object[] arr=list.toArray();
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		 
		
		

	}

}
