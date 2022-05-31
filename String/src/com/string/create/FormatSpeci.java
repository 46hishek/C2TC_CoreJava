package com.string.create;

public class FormatSpeci {

	public static void main(String[] args) {
		String s="First or New Job";
		System.out.println(String.format("%s",s));
		System.out.println(String.format("%f",54.876));
		System.out.println(String.format("%15.12f",674.342));
	}

}
