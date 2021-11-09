package com.testyantra.collection.treeset;

public class HashToTree implements Comparable<HashToTree>{
    int id;
    
	public HashToTree(int id) {
		super();
		this.id = id;
	}
    
	@Override
	public int compareTo(HashToTree o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
    
	@Override
	public String toString() {
		return "["+id+"]";
	}
    
}
