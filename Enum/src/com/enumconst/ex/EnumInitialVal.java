package com.enumconst.ex;

public class EnumInitialVal {
			public enum Planet{
				MERCURY(12),MARS(4),EARTH(7),SATURN(54),JUPITER(21),VENUS(43),URANUS(23);
			int val;
			Planet(int val)
			{
				this.val=val;
			}
			}
			public static void main(String[] args) {
				for(Planet P:Planet.values()) {
				System.out.println(P+" "+P.val);
				}
}
}
