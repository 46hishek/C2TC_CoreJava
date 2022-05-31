package com.string.create;

public class StartWith {

	public static void main(String[] args) {
		String s="First Job";
		System.out.println(s.startsWith("F"));
		System.out.println(s.startsWith("First"));
		System.out.println(s.startsWith("rs"));
		System.out.println(s.startsWith("t",4));
		System.out.println(s.startsWith("t",5));


	}

}
