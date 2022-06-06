package com.inheritance.oops;

class decade{
	void months(){
		System.out.println("A decade has 120 months");
	}
}
class  year extends decade{
	void months(){
		System.out.println("An year has 12 months");
	}
	void weeks(){
		System.out.println("Also a month has 4 weeks approax. and a week has 7 days");
		}
	void days(){
		super.months();
		weeks();
	}
}
public class SuperInParentMethod {
	public static void main(String args[]) {
	year y=new year();
	y.days();
		}
}
