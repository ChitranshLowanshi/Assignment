package com.testyantra.collection.treeset;

import java.util.Comparator;

public class ComapareFrnd implements Comparator<Freindship>{

		@Override
		public int compare(Freindship o1, Freindship o2) {
			return o1.relation.compareTo(o2.relation);
		}
}
