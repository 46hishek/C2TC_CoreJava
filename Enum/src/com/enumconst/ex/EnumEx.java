package com.enumconst.ex;

public class EnumEx {
	public enum Planet{
		MERCURY,MARS,EARTH,SATURN,JUPITER,VENUS,URANUS
	}
	

	public static void main(String[] args) {
		Planet P=Planet.EARTH;
		System.out.println(P);
		System.out.println(Planet.VENUS);
		

	}

}
