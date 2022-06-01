package com.strbuffer.eg;

public class StrReplace {

	public static void main(String[] args) {
		StringBuffer str= new StringBuffer("grow ");
		str.replace(1,3,"green");
		System.out.println(str);

	}

}
