package com.enumconst.ex;

public class EnumValuesEx {
		public enum Planet{
			MERCURY,MARS,EARTH,SATURN,JUPITER,VENUS,URANUS
		}
		

		public static void main(String[] args) {
			for(Planet P:Planet.values()) {
			System.out.println(P);
		}
	}
	}
