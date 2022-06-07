package com.abstractclass.use;

abstract class Bank{
	abstract float InterestRate();
}
class UBI extends Bank{
	float InterestRate() {
		return 6.421f;
	}
}
class PNB extends Bank{
		float InterestRate() {
			return 7.8541f;
		}

}
public class AbstractClassAndMethod2 {
	

	public static void main(String[] args) {
		UBI U=new UBI();
		System.out.println("Interest of UBI is: "+U.InterestRate());
		PNB P=new PNB();
		System.out.println("Interest of SBI is: "+P.InterestRate());
	}
}