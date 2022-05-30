package com.this1.keyword;
class S1{
	void m(S1 a) {
		System.out.println("method invoked");
	}
	void p() {
		m(this);
		
	}
	
}

public class Main1 {

	public static void main(String[] args) {
		S1 s1=new S1();
		s1.p();

	}

}
