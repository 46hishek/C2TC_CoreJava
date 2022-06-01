package com.strbuffer.eg;

public class EnsureCapacity {

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
			w.ensureCapacity(40);// it ensures the capacity i.e. atleast 40 value space is available or not,if not then do ((34*2)+2) is 68+2=70
			System.out.println(w.capacity());//gives 70 as output
			w.append(" please beaware of it ,this is harmful for you");
			System.out.println(w);
			System.out.println(w.capacity());//it will double the capacity as we will add some string values to w, so now output will be ((70*2)+2 is 140+2=142
			w.ensureCapacity(150);//it ensures the capacity i.e. atleast 150 value space is available or not,if not then do ((142*2)+2) is 284+2=286
			System.out.println(w.capacity());//gives 286 as output
			
		}
	}
