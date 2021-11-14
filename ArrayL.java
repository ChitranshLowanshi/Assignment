package com.technoelevate.basicsjava.assignmentfetchingonlineusinginterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayL {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(12);
		arrayList.add(89);
		arrayList.add(66);
		System.out.println(arrayList);

		for (Integer integer : arrayList) {
			System.out.println(integer);

		}

		LinkedList<String> list = new LinkedList<String>();
		list.add("azesha");
		list.add("roza");
		list.add("Sandy");

		System.out.println(list);
		for (String string : list) {
			int j = list.indexOf("roza");
			System.out.println(j);
			list.remove(j);
			System.out.println(list);

		}

	}

}
