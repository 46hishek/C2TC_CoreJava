package com.inheritance.oops;

class Army{
	String Unit="Rastriya Rifles Regiment";
}
class Regiments extends Army {
	String Unit="Dogra Regiment";
	void categories() {
		System.out.println(Unit);
		System.out.println(super.Unit);
	}
}
public class SuperKeywordEg {

	public static void main(String[] args) {
		Regiments r=new Regiments();
		r.categories();
	}
}