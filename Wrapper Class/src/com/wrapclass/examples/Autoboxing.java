package com.wrapclass.examples;

public class Autoboxing {

	public static void main(String[] args) {
		int i=12;
		Integer inte=Integer.valueOf(i);//converts integer value to Integer (Wrapper class)
		Integer j=i;//does autoboxing
		System.out.println(i+" "+j+" "+inte);
	}

}
