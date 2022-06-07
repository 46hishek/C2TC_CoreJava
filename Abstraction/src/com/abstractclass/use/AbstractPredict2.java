package com.abstractclass.use;
/*abstract class AbstractPredict2{
	abstract void method();
	public void normal() {
		System.out.println("I'm world's largest democracy");
		
	}
}

public class B extends AbstractPredict2{//public can be use only for one particular class
	void method() {
		System.out.println("I'm INDIA");
	}
	public static void main(String[] args) {
		B b=new B();
		b.method();
		b.normal();
		
		}
	}
*/







//final abstract class dress{//class can either be final or abstract type if we use both like in this line it will throw error
abstract class dress{
	abstract void type();
}

class forMen extends dress{
	void type() {
		System.out.println("It's a Men Wear");
	}
}
public class AbstractPredict2{
	public static void main(String[] args) {
		forMen f=new forMen();
		f.type();
		}
	}