package com.technoelevate.basicsjava.assignmentfetchingonlineusinginterface;

import java.util.ArrayList;

public class FetchOnlyIntUsingitr {
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>(10);
		list.add(2);
		list.add("asd");
		list.add(32.4);
		list.add(65);
		
		for(Object obj:list) {
			if(obj.getClass()==Integer.class) {
				System.out.println("I found int :"+obj);
			}
		}

	}
}

