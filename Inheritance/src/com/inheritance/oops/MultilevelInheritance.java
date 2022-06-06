package com.inheritance.oops;
class trees{
	void has() {
		System.out.println("Branches");
	}
}
class  branch extends trees{
	void contains() {
		System.out.println("Leaves,Fruits");
	}
}
class fruits extends branch{
	void types() {
		System.out.println("Mango,Apple etc");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		fruits f=new fruits();
		f.contains();
		f.types();
		f.has();
	}
}
