package com.this1.keyword;

public class ThisDemo {
	void td() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		ThisDemo td=new ThisDemo();
		System.out.println(td);
		td.td();

	}

}
