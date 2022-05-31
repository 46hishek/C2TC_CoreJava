package com.string.create;

public class StrToChArr {

	public static void main(String[] args) {
		String s="First Job";
		char c[]=s.toCharArray();
		for(int a=0;a<c.length;a++) {
		System.out.print(c[a]);
		}
		
		//System.out.println(c[4]);gives "t" as char output in same line,beside using println
	}
}