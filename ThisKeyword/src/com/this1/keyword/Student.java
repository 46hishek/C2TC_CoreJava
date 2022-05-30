package com.this1.keyword;

class Student{
	int roll;
	String name;
	float fee;
	Student(int roll,String name,float fee)
	{
		this.roll=roll;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(roll+" "+name+" "+fee);
	}
	public static void main(String[] args) {
		Student s1= new Student(111,"ABHi",103000f);
		Student s2= new Student(222,"RAI",111000f);
		s1.display();
		s2.display();
		}
    }
