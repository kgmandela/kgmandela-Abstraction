package org.abstraction;

public class GreensBank extends RbiBank {

	//check
	@Override
	public void savings() {
		System.out.println("savings 3%");
			}

	@Override
	public void current() {
		System.out.println("current 5%");
		
	}
	public void deposit() {
		System.out.println("deposit 10%");
	}
	@Override
	public void fixed() {
		System.out.println("fixed 15%");
	}
	//upcasting - logic comes from parent class(Rbi), value comes from child class(Greens)
	public static void main(String[] args) {
		RbiBank rbi=new GreensBank();
				rbi.savings();
				rbi.current();
				rbi.fixed();
				
				GreensBank gri=new GreensBank();
				gri.fixed();
				gri.deposit();
	}
}
