package org.abstraction;

public abstract class RbiBank {

	public abstract void savings(); 
	public abstract void current(); 
	
	public void fixed() {
		System.out.println("fixed 10%");

	}
}
