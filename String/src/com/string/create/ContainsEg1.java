package com.string.create;

public class ContainsEg1 {
	public static void main(String[] args) {
		String S="make some v*a*l*u*e*";
		boolean cont=S.contains("v*a*l*u*e*");
		System.out.println(cont);
		System.out.println(S.contains("value"));
}
}