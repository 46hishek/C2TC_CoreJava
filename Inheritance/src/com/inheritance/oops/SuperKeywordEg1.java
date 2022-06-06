package com.inheritance.oops;

class cricket{
	cricket(){
		System.out.println("constructor cricket is created");
	}
}
class team extends cricket {
	team() {
		super();
		System.out.println("constructor team is created");
	}
}
public class SuperKeywordEg1 {

	public static void main(String[] args) {
		team t=new team();
	}
}