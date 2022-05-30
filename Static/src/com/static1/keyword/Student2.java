package com.static1.keyword;
class Student2 {
	int roll;
	String name;
	static String college;
	static {
		college="BMSit";
	}
	Student2(int r,String n){
		roll=r;
		name=n;
	}
	
	static void change() {
		college="Atria";
	}
	
	void display() {
		System.out.println(roll+" "+name+" "+college);
	}

	public static void main(String[] args) {
		Student2 s1= new Student2(101,"ABHi");
		Student2 s2= new Student2(202,"RAI");
		change();
		s1.display();
		s2.display();
	}
	
}
