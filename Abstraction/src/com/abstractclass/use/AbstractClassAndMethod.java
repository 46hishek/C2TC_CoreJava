package com.abstractclass.use;
abstract class bike{
	abstract void run();
}
class RE extends bike{
	void run() {
		System.out.println("RE is classic bike");
	}

}
public class AbstractClassAndMethod {
	

	public static void main(String[] args) {
		RE r=new RE();
		r.run();
		//bike b=new RE();we can give the reference of abstract class, also it will give the output similar to line 15
		//b.run();
	}

}
