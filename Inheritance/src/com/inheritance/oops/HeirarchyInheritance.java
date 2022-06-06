package com.inheritance.oops;

class Oil{
	void purpose() {
		System.out.println("Oil can be used Differently");
	}
}
class  VegetableOil extends Oil{
	void use() {
		System.out.println("For Making Food");
	}
}
class EngineOil extends Oil{
	void types() {
		System.out.println("For Cars,Bike,etc. Engine");
	}
}
class CrudeOil extends Oil{
	void gives() {
		System.out.println("Petrol,Deisel,Kerosene etc");
		
	}
}
public class HeirarchyInheritance {

	public static void main(String[] args) {
		CrudeOil c=new CrudeOil();
		EngineOil e=new EngineOil();
		VegetableOil v=new VegetableOil();
		c.purpose();
		c.gives();
		e.purpose();
		e.types();
		v.purpose();
		v.use();
		}
}
		
