package com.polymorphism.types;
class logic{
	static int and(int a,int b,int c){
		return a&b&c;
	}
	static int and(int a,int b) {
		return a&b;
	}
	static int or(int a,int b,int c){
		return a|b|c;
	}
	static int or(int a,int b) {
		return a|b;
	}
}

public class Overloading {

	public static void main(String[] args) {
		System.out.println("A&B is: "+logic.and(2,3));
		System.out.println("A&B&C is: "+logic.and(6,7,7));
		System.out.println("A|B is: "+logic.or(2,3));
		System.out.println("A|B is: "+logic.or(6,7,7));
	

	}

}
