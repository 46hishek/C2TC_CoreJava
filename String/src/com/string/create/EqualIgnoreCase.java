package com.string.create;

public class EqualIgnoreCase {

	public static void main(String[] args) {
		String s="The Last Ride";
		String s1="The LaSt RiDE";
		String s2="THE LAST RIDE";
		String s3="The Last Kid";
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.equalsIgnoreCase(s3));
		

	}

}
