package com.offcn.t1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionText1 {
	//修改后dddd
	public static void main(String[] args) {
		  Collection list =new ArrayList();
		  list.add("计算机网络");
		  list.add("现代操作系统");
		  list.add("java编程思想");
		  System.out.println(list);
		  Collection list2=new ArrayList();
		  list2.add("java核心技术");
		  list2.addAll(list);
		  list2.add("java语言程序设计");
		  System.out.println(list2);
		  boolean remove=list2.remove("java核心技术");
		  System.out.println(remove);
		  System.out.println(list2);
		  Collection list3=new ArrayList();
		  list3.add("计算机网络");
		  list3.add("现代操作系统");
		  list3.add("java编程思想");
		  list3.add("java核心技术");
		  list3.add("java语言程序设计");
		  System.out.println(list);
		  list.clear();
		  System.out.println(list);
	}

}
