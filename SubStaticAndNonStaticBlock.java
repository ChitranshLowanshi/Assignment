package com.technoelevate.javabasics.blockdemo;

public class SubStaticAndNonStaticBlock extends StaticAndNonStaticBlock{

	public SubStaticAndNonStaticBlock() {
		System.out.println("Child class constructor");
	}
	{
		System.out.println("Chlid non static block");
	}
    static {
    	System.out.println("Chlid static block");
    }
}