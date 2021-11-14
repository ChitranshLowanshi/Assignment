package com.technoelevate.basicsjava.assignmentfetchingonlineusinginterface;

public class LambaC {
	public static void main(String[] args) {
		CarI carI = () -> {
			System.out.println("Car brand is: " + CarI.name);
			System.out.println("Wheel present is: " + CarI.wheel);

		};
		carI.details();

	}

}
