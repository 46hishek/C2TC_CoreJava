package com.enumconst.ex;

public class EnumValuesValuesOfOrdinalEx {
		public enum Planet{
			MERCURY,MARS,EARTH,SATURN,JUPITER,VENUS,URANUS
		}
		public static void main(String[] args) {
			for(Planet P:Planet.values()) {
			System.out.println(P);
			}
			System.out.println("The Value of SATURN is: "+Planet.valueOf("SATURN"));
			System.out.println("The Index of JUPITER is: "+Planet.valueOf("JUPITER").ordinal());
			System.out.println("The Index of URANUS is: "+Planet.valueOf("URANUS").ordinal());
	}
}
