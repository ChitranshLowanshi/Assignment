package com.testyantra.collection.treeset;

import java.util.HashSet;
import java.util.TreeSet;

public class MainHasToTree {

	public static void main(String[] args) {
    HashSet<HashToTree> set=new HashSet<HashToTree>();
    set.add(new HashToTree(65));
    set.add(new HashToTree(45));
    set.add(new HashToTree(96));
    set.add(new HashToTree(1));
    set.add(new HashToTree(36));
    TreeSet<HashToTree> set1=new TreeSet<HashToTree>(set);
    System.out.println(set1);
	}

}
