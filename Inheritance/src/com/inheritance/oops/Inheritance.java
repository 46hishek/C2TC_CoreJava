package com.inheritance.oops;
class university{
	void runs() {
		System.out.println("College");
	}
}
class college extends university{
	void has() {
		System.out.println("Departments");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		college c=new college();
		c.has();
		c.runs();
	}
}
