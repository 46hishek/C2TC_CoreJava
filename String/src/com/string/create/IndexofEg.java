package com.string.create;

public class IndexofEg {

	public static void main(String[] args) {
		String s1="The last ride";
		int ind=s1.indexOf("l");
		System.out.println(ind);
		int ind1=s1.indexOf("st r");
		int ind2=s1.indexOf("ide");
		System.out.println(ind1);
		System.out.println(ind2);
		int ind3=s1.indexOf("t r",2);
		System.out.println(ind3);
		}

}
