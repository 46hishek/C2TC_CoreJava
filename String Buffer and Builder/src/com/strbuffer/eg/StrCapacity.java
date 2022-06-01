package com.strbuffer.eg;

public class StrCapacity {

	public static void main(String[] args) {
		StringBuffer w= new StringBuffer();
		StringBuffer w1= new StringBuffer("flow ");
		System.out.println(w.capacity());//output default capacity 16
		System.out.println(w1.capacity());
		w.append("danger ");
		w1.append("wolf");
		System.out.println(w.capacity());
		System.out.println(w1);
		w.append("wolf is roaming around");
		System.out.println(w);
		System.out.println(w.capacity());//(16*2)+2 is 32+2=34 as output
		w.append(" please beaware of it ,this is harmful for you");
		System.out.println(w);
		System.out.println(w.capacity());//(34*2)+6 is 68+6=74 as output because we hv already added the String values to string buffer even formula is ((oldcapacity*2)+2)
		//so the output should be 70 as (34*2)+2 is 68+2=70 we are getting as 75
		
	}

}
