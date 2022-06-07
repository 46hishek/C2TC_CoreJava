package com.abstractclass.use;
/*abstract class animal1{
	public abstract void sound();
}

public class lion extends animal1{//there should be only one public class
	public void sound() {
		System.out.println("ROAR");
	}
public class AbstractPredict1 {
	public static void main(String[] args) {
		animal1 goat =new lion();
		
		}
	}
}*/

abstract class base{
	void fun() {
		System.out.println("abstract class method");
}
}

class derived extends base{
	}
public class AbstractPredict1 {
	public static void main(String[] args) {
		derived d=new derived();
		d.fun();
		
		}
	}