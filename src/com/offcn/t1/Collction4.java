package com.offcn.t1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Collction4 {

	public static void main(String[] args) {
		Collection list=new ArrayList();
		list.add("���������");
		list.add("�ִ�����ϵͳ");
		list.add("java���˼��");
		list.add("java���ļ���");
		list.add("java���Գ������");
		Object[] arr=list.toArray();
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		 
		
		

	}

}
