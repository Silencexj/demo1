package com.offcn.t1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionText1 {
	//�޸ĺ�dddd
	public static void main(String[] args) {
		  Collection list =new ArrayList();
		  list.add("���������");
		  list.add("�ִ�����ϵͳ");
		  list.add("java���˼��");
		  System.out.println(list);
		  Collection list2=new ArrayList();
		  list2.add("java���ļ���");
		  list2.addAll(list);
		  list2.add("java���Գ������");
		  System.out.println(list2);
		  boolean remove=list2.remove("java���ļ���");
		  System.out.println(remove);
		  System.out.println(list2);
		  Collection list3=new ArrayList();
		  list3.add("���������");
		  list3.add("�ִ�����ϵͳ");
		  list3.add("java���˼��");
		  list3.add("java���ļ���");
		  list3.add("java���Գ������");
		  System.out.println(list);
		  list.clear();
		  System.out.println(list);
	}

}
