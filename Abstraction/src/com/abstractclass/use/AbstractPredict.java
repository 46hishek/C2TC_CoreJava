package com.abstractclass.use;

/*abstract class animal{
	abstract void eat();
}
class herbivores extends animal{
	void eat() {
		System.out.println("eats grass");
	}
}
class omnivores extends animal{
	void eat() {
		System.out.println("eats meat");
	}
public class AbstractPredict {

	public static void main(String[] args) {
		animal goat =new animal();//we cannot instantiate the abstract class
	}

}
}
*/
abstract class animal{
	abstract void eat();
}
class herbivores extends animal{
	void eat() {
		System.out.println("eats fruits or veggis");
	}
}
class carnivores extends animal{
	void eat() {
		System.out.println("eats meat");
	}
}
class omnivores extends animal{
	void eat() {
		System.out.println("eats meat and fruits");
	}
}
public class AbstractPredict {

	public static void main(String[] args) {
		animal cow =new herbivores();//we cannot instantiate the abstract class
		animal tiger =new carnivores();
		animal  dogs=new omnivores();
		cow.eat();
		tiger.eat();
		dogs.eat();
	}
	

}

