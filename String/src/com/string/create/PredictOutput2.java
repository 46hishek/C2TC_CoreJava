package com.string.create;

public class PredictOutput2 {

	public static void main(String[] args) {
		String s1="Apple ";
		int a=11;
		String s2=null;
		System.out.println(s1+a);//this will give output as "Apple 11"
		System.out.println(s1+s2);//this will give output as "Apple null"
		//System.out.println(s1.concat(a));//will give exception as concat will take only string value not integer (here a)
		//System.out.println(s1.concat(s2));//will give exception as concat will take only string value(here we hv null i.e. empty string)

	}

}
