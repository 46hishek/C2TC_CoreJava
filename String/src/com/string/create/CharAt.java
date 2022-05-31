package com.string.create;

public class CharAt {

	public static void main(String[] args) {
		String s="Last Ride";
		char c=s.charAt(3);
		System.out.println(c);
		System.out.println(s.charAt(7));
		System.out.println(s.charAt(10));//Throws Exception as position doesn't exist and 11th line will not execute
		System.out.println(s.charAt(-1));//it also Throws Exception  if we execute

	}

}
