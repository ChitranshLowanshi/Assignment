package com.testyantra.collection.treeset;

public class Freindship implements Comparable<Freindship> {
		String name;
		int age;
		String relation;
		
		public Freindship(String name, int age, String relation) {
			super();
			this.name = name;
			this.age = age;
			this.relation = relation;
		}

		

		@Override
		public String toString() {
			return "Freindship [name=" + name + ", age=" + age + ", relation=" + relation + "]";
		}



		@Override
		public int compareTo(Freindship o) {
			return this.relation.compareTo(o.relation);
		}
		

}
