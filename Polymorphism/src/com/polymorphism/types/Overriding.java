package com.polymorphism.types;
	class year{
		int months(){
			return 12;
		}
	}
	class summer extends year{
		int months(){
			return 3;
		}	
	}
	class monsoon extends year{
		int months() {
			return 2;
		}
	}
	class autumn extends year{
		int months() {
			return 2;
		}
	}
	class winter extends year{
		int months() {
			return 3;
		}
	}
	class spring extends year{
		int months() {
			return 2;
		}
	}

public class Overriding {

	public static void main(String[] args) {
		summer s=new summer();
		monsoon m=new monsoon();
		autumn a=new autumn();
		winter w=new winter();
		spring sp=new spring();
		System.out.println("No. of Months of Season is:"+s.months());
		System.out.println("No. of Months of Season is:"+m.months());
		System.out.println("No. of Months of Season is:"+a.months());
		System.out.println("No. of Months of Season is:"+w.months());
		System.out.println("No. of Months of Season is:"+sp.months());
	}
}
