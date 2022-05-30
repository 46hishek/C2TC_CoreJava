package com.static1.keyword;
class Student {
	int roll;
	String name;
	static String college="Atria College";
	Student(int r,String n){
		roll=r;
		name=n;
	}
	void display() {
		System.out.println(roll+" "+name+" "+college);
	}

	public static void main(String[] args) {
		Student s1= new Student(101,"ABHi");
		Student s2= new Student(202,"RAI");
		s1.display();
		s2.display();
		
				

	}

}
