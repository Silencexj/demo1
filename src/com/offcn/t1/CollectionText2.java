package com.offcn.t1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionText2 {

	public static void main(String[] args) {
		Collection list=new ArrayList();
		list.add("���������");
		list.add("�ִ�����ϵͳ");
		list.add("java���˼��");
		list.add("java���ļ���");
		list.add("java���Լ���");
		System.out.println(list);
		boolean empty=list.isEmpty();
		System.out.println(empty);
		boolean contains=list.contains("java���˼��");
		System.out.println(contains);
		Collection list2=new ArrayList();
		list2.add("ˮ䰴�");
		boolean containsAll=list.containsAll(list2);
		System.out.println(containsAll);
	}

}
