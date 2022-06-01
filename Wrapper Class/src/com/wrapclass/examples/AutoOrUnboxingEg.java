package com.wrapclass.examples;

public class AutoOrUnboxingEg {

	public static void main(String[] args) {
		//UNBOXING = Converts Objects (Wrapper Class) to Primitive Datatypes;
		byte bytevalue=11;
		short s=12;
		int i=21;
		float f=43.56f;
		long l=908l;
		double d=65.00;
		char c='i';
		boolean b1=true;
		System.out.println("UNBOXING = Converts Objects (Wrapper Class) to Primitive Datatypes;");
		System.out.println("                                                              ");
		System.out.println("Printing Primitive Values........ ");
		System.out.println("__________________________________");
		System.out.println("Byte Value: "+bytevalue);
		System.out.println("Short Value: "+s);
		System.out.println("Int Value: "+i);
		System.out.println("Float Value: "+f);
		System.out.println("Long Value: "+l);
		System.out.println("Double Value: "+d);
		System.out.println("Char Value: "+c);
		System.out.println("Boolean Value: "+b1);
		System.out.println("                                                              ");
		System.out.println("                                                              ");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------------------");
		
		//AUTOBOXING = Converts Primitive Datatypes to Objects (Wrapper Class);
		Byte b2=11;
		Short s1=12;
		Integer i1=21;
		Float f1=43.56f;
		Long l1=443l;
		Double d1=65.00;
		Character c1='u';
		Boolean b3=false;
		System.out.println("                                                              ");
		System.out.println("                                                              ");
		System.out.println("AUTOBOXING = Converts Primitive Datatypes to Objects (Wrapper Class)");
		System.out.println("                                                              ");
		System.out.println("Printing Objects Values........");
		System.out.println("___________________________________");
		System.out.println("Byte Value: "+b2);
		System.out.println("Short Value: "+s1);
		System.out.println("Integer Value: "+i1);
		System.out.println("Float Value: "+f1);
		System.out.println("Long Value: "+l1);
		System.out.println("Double Value: "+d1);
		System.out.println("Character Value: "+c1);
		System.out.println("Boolean Value: "+b3);
	}

}
