package com.abstractclass.use;

abstract class shape{
	abstract void draw();
}
class square extends shape{
	void draw() {
		System.out.println("Make a square");
	}
}
class sphere extends shape{
		void draw() {
			System.out.println("Make a sphere");
		}

}
public class AbstractClassAndMethod1 {
	

	public static void main(String[] args) {
		shape s=new square();
		s.draw();
		shape sh=new sphere();
		sh.draw();
	}
}