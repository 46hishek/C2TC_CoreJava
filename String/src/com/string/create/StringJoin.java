package com.string.create;

public class StringJoin {

	public static void main(String[] args) {
		String s=String.join("welcome","to","my","github"," ","account","");
		String s1=String.join("","welcome","to","my","github"," ","account");
		String s2=String.join(" ","welcome","to","my","github","account");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}

}
