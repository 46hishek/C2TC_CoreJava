package com.this1.keyword;
class Demo{
	Demo(){
		System.out.println("non parameterized constructor");
	}
	Demo(int x){
		this();
		System.out.println(x);
	}
}

public class ThisDemo2{
	public static void main(String []args) {
		Demo d=new Demo(10);
		
	}

}

