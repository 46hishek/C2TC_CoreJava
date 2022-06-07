package com.abstractclass.use;

abstract class car{
	car(){
		System.out.println("Car constructer is created inside abstract class car,");
		System.out.println();
	}
	abstract void run();
	void NoOfGear()//it's a by default static method as we can make static method in abstract class
	{
		System.out.println("NoOfGear  static method is created inside abstract class car.");
		System.out.println();
	}
}
class honda extends car{
	void run() {
		System.out.println("Run method is implemented in honda subclass extended from abstract class car, and ");
		System.out.println();
	}

}
public class AbstractClassAndConstructer {
	
	public static void main(String[] args) {
		honda r=new honda();
		r.run();
		r.NoOfGear();
	}
}