package com.this1.keyword;
class Hello{
	Hello(){
		this(10);
		System.out.println("Hello User");
	}
	Hello(int x){
		System.out.println(x);
	}
}

public class Main{
	public static void main(String []args) {
		Hello h=new Hello();
		
	}

}