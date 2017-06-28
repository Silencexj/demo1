package com.offcn.t1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionText2 {

	public static void main(String[] args) {
		Collection list=new ArrayList();
		list.add("计算机网络");
		list.add("现代操作系统");
		list.add("java编程思想");
		list.add("java核心技术");
		list.add("java语言技术");
		System.out.println(list);
		boolean empty=list.isEmpty();
		System.out.println(empty);
		boolean contains=list.contains("java编程思想");
		System.out.println(contains);
		Collection list2=new ArrayList();
		list2.add("水浒传");
		boolean containsAll=list.containsAll(list2);
		System.out.println(containsAll);
	}

}
