package com.abstractclass.use;

import java.util.Scanner;
abstract class Movie{
	String Moviename;
	abstract void setTitle(String S);
}
class MyMovie extends Movie{
	void setTitle(String S) {
		Moviename=S;
		}
		String Titleis() {
			return Moviename;
		}
	}
public class AbstractPracticeQues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		String Moviename=sc.nextLine();
		MyMovie m=new MyMovie();
		m.setTitle(Moviename);
		System.out.println("The Movie Name is: "+m.Titleis());
		

	}

}
