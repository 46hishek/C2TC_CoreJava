package com.static1.keyword;
class Student1 {
	int roll;
	String name;
	static String college="BMSIT College";
	
	Student1(int r,String n){
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
		Student1 s1= new Student1(101,"ABHi");
		Student1 s2= new Student1(202,"RAI");
		change();
		s1.display();
		s2.display();
	}
	
}

