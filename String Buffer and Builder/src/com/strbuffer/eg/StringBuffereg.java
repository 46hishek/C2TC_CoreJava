package com.strbuffer.eg;

public class StringBuffereg {

	public static void main(String[] args) {
		String s="good";
		s.concat("afternoon");
		System.out.println(s);//output "good"
		String str=s.concat("afternoon");
		System.out.println(str);// output "goodafternoon"
		StringBuffer s1= new StringBuffer("good");//create string buffer and assign s1 as"good"
		s1.append("afternoon");//append will concat "afternoon" with "good" in StringBuffer s1
		System.out.println(s1);// gives output as "goodafternoon"
		

	}

}
