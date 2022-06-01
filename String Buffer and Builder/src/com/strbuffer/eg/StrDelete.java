package com.strbuffer.eg;

public class StrDelete {

	public static void main(String[] args) {
		StringBuffer str= new StringBuffer("grow");
		str.delete(1,3);
		System.out.println(str);
	}

}
