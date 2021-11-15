package com.technoelevate.casestudy.multiplayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiplayer {
	static List<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		list.add("Song1");
		list.add("Song2");
		list.add("Song3");
		list.add("Song4");
		list.add("Song5");
		main();
		
	}

	public static void main() {
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Play a song\n2.Search for a song\n3.Operate on Multiplayer\n4Exit");
		i = scanner.nextInt();
		Multiplayer out = new Multiplayer();
		out.display(i);}
		public void display(int x) {
		switch (x) {
		case 1:
			System.out.println("Play a song");
			Multiplayer out = new Multiplayer();
			out.play();
			break;
		case 2:
			System.out.println("Search for a song");
			Multiplayer out1 = new Multiplayer();
			out1.search();
			break;
		case 3:
			System.out.println("Operate on Multiplayer");
			Multiplayer multiplayer = new Multiplayer();
			multiplayer.operation();
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Please enter a vaild input");
		}
	}

	public void operation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Add a song\n2.Delete a song\n3.Go back to main menu");
		int i = scanner.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("Please Add a Song");
			Scanner scanner2 = new Scanner(System.in);
			String s = scanner2.nextLine();
			list.add(s);
			System.out.println("Updated song list: ");
			for (int k = 0; k < list.size(); k++) {
				System.out.println(list.get(k));
			}
			Scanner scanner4=new Scanner(System.in);
			System.out.println("print exit to go back");
			String s2= scanner4.nextLine();
			if(s2.equals("exit")) {
			Multiplayer multiplayer=new Multiplayer();
			multiplayer.operation();
			}
		case 2:
			System.out.println("Enter a song name to be deleted : ");
			Scanner scanner3 = new Scanner(System.in);
			String sc = scanner3.nextLine();
			for (int l = 0; l < list.size(); l++) {
				if (sc.contains(list.get(l))) {
					list.remove(l);
					System.out.println("Updated song list : ");
					for (int m = 0; m < list.size(); m++) {
						System.out.println(list.get(m));
					}
					break;
				} else if (l == list.size() - 1) {
					System.out.println("Song is not Present");
				}
			}
			Scanner scanner5=new Scanner(System.in);
			System.out.println("print exit to go back");
			String s4= scanner5.nextLine();
			if(s4.equals("exit")) {
			Multiplayer multiplayer=new Multiplayer();
			multiplayer.operation();
			}
		case 3 :
		Multiplayer multiplayer=new Multiplayer();
		multiplayer.main();
			
		}
	}

	public void search() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Search for the song");
		String s = scanner.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (s.contains(list.get(i))) {
				System.out.println("Song is present");
				break;
			} else if (i == list.size() - 1) {
				System.out.println("Song is not Present");
			}
		}
		Scanner scanner2=new Scanner(System.in);
		System.out.println("print exit to go back");
		String s1= scanner2.nextLine();
		if(s1.equals("exit")) {
		Multiplayer multiplayer=new Multiplayer();
		multiplayer.main();
		}
	}

	public void play() {
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Play all song\n2.Play a random song\n3.Play a perticular song\n4.Exit");
		i = scanner.nextInt();
		switch (i) {
		case 1:
			for (int j = 0; j < list.size(); j++) {
				System.out.println(list.get(j));
			}
			Scanner scanner2=new Scanner(System.in);
			System.out.println("print exit to go back");
			String s= scanner2.nextLine();
			if(s.equals("exit")) {
			Multiplayer multiplayer=new Multiplayer();
			multiplayer.play();
			}
			break;
		case 2:
			double d = Math.random();
			int random = (int) (d * 4);
			System.out.println(list.get(random) + " is playing..");
			Scanner scanner3=new Scanner(System.in);
			System.out.println("print exit to go back");
			String w= scanner3.nextLine();
			if(w.equals("exit")) {
			Multiplayer multiplayer=new Multiplayer();
			multiplayer.play();
			}
			break;
		case 3:
			System.out.println("Play a perticular song");
			for (int j = 0; j < list.size(); j++) {
				System.out.println(list.get(j));
			}
			{
			
			int q;
			q = scanner.nextInt();
			System.out.println(list.get(q - 1) + " is playing");
			}
			Scanner scanner4=new Scanner(System.in);
			System.out.println("print exit to go back");
			String z= scanner4.nextLine();
			if(z.equals("exit")) {
			Multiplayer multiplayer=new Multiplayer();
			multiplayer.play();
			}
			break;
		case 4:
			main();
			break;
		default:
			System.out.println("Enter the valid input");
			break;
		}
		
	}
}
