package com.wrapclass.examples;

public class Upboxing {

	public static void main(String[] args) {
		Integer inte=new Integer(3);
		int i=inte.intValue();//converts Integer(wrapper class) to primitive datatype
		int j=inte;//unboxing
		System.out.println(i+" "+j+" "+inte);

	}

}
