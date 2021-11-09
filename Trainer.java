package com.testyantra.collection.treeset;

 public class Trainer implements Comparable<Trainer> {
	int id;
	String name;
	String experience;
	public Trainer(int id, String name, String experience) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", experience=" + experience + "]"+"\n";
	}
	@Override
	public int compareTo(Trainer o) {
		return this.experience.compareTo(o.experience);
	}
}
