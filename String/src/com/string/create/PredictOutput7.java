package com.string.create;

public class PredictOutput7 {

	public static void main(String[] args) {
		String s1="Apple is a Fruit";
		int ind=s1.lastIndexOf("is");
		System.out.println(ind);
		int ind1=s1.lastIndexOf("a",12);
		System.out.println(ind1);
		int ind2=s1.lastIndexOf("is",4);
		System.out.println(ind2);

	}

}
