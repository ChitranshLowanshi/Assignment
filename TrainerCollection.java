package com.testyantra.collection.treeset;

import java.util.ArrayList;
import java.util.Collections;

public class TrainerCollection {
		public static void main(String[] args) {
			ArrayList<Trainer> ar=new ArrayList<Trainer>();
			ar.add(new Trainer(1,"Sani","7Yrs"));
			ar.add(new Trainer(2,"Ani","9Yrs"));
			ar.add(new Trainer(3,"mani","3Yrs"));
			ar.add(new Trainer(4,"rani","2Yrs"));
			Collections.sort(ar);
			System.out.println(ar);
			TrainerDec dec=new TrainerDec();
			Collections.sort(ar,dec);
			System.out.println(ar);
		}

}
