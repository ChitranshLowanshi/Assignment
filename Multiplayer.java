package com.technoelevate.casestudy.multiplayer;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiplayer {
	static List<String> list= new ArrayList<String>();
public static void main(String[] args) {
	
	list.add("Song1");
	list.add("Song2");
	list.add("Song3");
	list.add("Song4");
	list.add("Song5");
	
		int i;
		Scanner scanner= new Scanner(System.in);
		System.out.println("1.Play a song\n2.Search for a song\n3.Operate on Multiplayer");
		i=scanner.nextInt();
		switch(i) {
		case 1: System.out.println("Play a song");
		        Multiplayer out= new Multiplayer();
		        out.play();
		break;
		case 2: System.out.println("Search for a song");
		        Multiplayer out1= new Multiplayer();
		        out1.search();
		break;
		case 3: System.out.println("Operate on Multiplayer");
		        Multiplayer multiplayer = new Multiplayer();
		        multiplayer.operation();
		break;
		default:System.out.println("Please enter a vaild input");
		}
		
}
public void operation() {
	Scanner scanner= new Scanner(System.in);
	System.out.println("1.Add a song\n2.Delete a song");
	int i = scanner.nextInt();
	switch(i) {
	case 1 : System.out.println("Please Add a Song");
	         Scanner scanner2= new Scanner(System.in);
	         String s = scanner2.nextLine();
	         list.add(s);
	         System.out.println("Updated song list: ");
	         for (int k = 0; k < list.size(); k++) {
				System.out.println(list.get(k));
			}
	case 2 : System.out.println("Enter a song name to be deleted : ");
	         Scanner scanner3 = new Scanner(System.in);
	         String sc=scanner3.nextLine();
	         for (int l = 0; l < 5; l++) {
	             if(sc.contains(list.get(l))) {
	             	list.remove(l);
	             	System.out.println("Updated song list : ");
	             	for (int m = 0; m < list.size(); m++) {
	    				System.out.println(list.get(m));
	    			}
	             	break;
	             }
	             else if(i==list.size()-1) {
	             	System.out.println("Song is not Present");
	             }
	     	}
	         }
	
}
public void search() {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Search for the song");
	String s= scanner.nextLine();
	for (int i = 0; i < 5; i++) {
        if(s.contains(list.get(i))) {
        	System.out.println("Song is present");
        	break;
        }
        else if(i==list.size()-1) {
        	System.out.println("Song is not Present");
        }
	}
}
public void play() {
	int i;
	Scanner scanner= new Scanner(System.in);
	System.out.println("1.Play all song\n2.Play a random song\n3.Play a perticular song");
	i=scanner.nextInt();
	switch(i) {
	case 1:  for (int j = 0; j < list.size(); j++) {
				System.out.println(list.get(j));
			}
	break;
	case 2: 
		double d=Math.random();
		int  random=(int)(d*4);
		System.out.println(list.get(random)+" is playing..");
	break;
	case 3: System.out.println("Play a perticular song");
	System.out.println("1.Song1\n2.Song2\n3.Song3\n4.Song4\n5.Song5");
	        int q;
	        q=scanner.nextInt();
	        System.out.println(list.get(q-1)+" is playing");
	break;
	default: System.out.println("Enter the valid input");
	break;
	}
}
}
