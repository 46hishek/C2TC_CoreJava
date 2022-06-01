package com.enumconst.ex;

public class EnumSwitchStEg {
	public enum Month{
		JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY;
	}
		public static void main(String []args) {
			Month M=Month.JUNE;
			switch(M)
			{
			case JUNE:System.out.println("Be Ready");//Output is "Be Ready"
				break;
			case JULY:System.out.println("Exams Time");
				break;
			default:System.out.println("Keep Working");
			}
		}
	}

