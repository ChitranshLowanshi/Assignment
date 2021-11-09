package com.testyantra.collection.treeset;

import java.util.ArrayList;
import java.util.Collections;

public class MainCompareFrnd {
	public static void main(String[] args) {
		ArrayList<Freindship> list1=new ArrayList<Freindship>();
		list1.add(new Freindship("domac", 100, "BestFriend"));
		list1.add(new Freindship("atree", 10, "justFriend"));
		list1.add(new Freindship("sweta", 1, "Friend"));
		list1.add(new Freindship("suchi", 90, "normalFriend"));
		list1.add(new Freindship("mama", 8, "Friend"));
		System.out.println(list1);
	    ComapareFrnd comapare=new ComapareFrnd();
		Collections.sort(list1,comapare);
		System.out.println(list1);
	}
}
