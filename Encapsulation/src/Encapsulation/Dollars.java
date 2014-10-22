package Encapsulation;


public class Dollars {
	
	private int dollars = 0;
	
	

	public int getDollars() {		
		return dollars;
	}

	public void setDollars(int dollars) {
		int e = 6;
		System.out.println("1 " + dollars);
		
		this.dollars = dollars + e;
		System.out.println("2 " + dollars + e);
	}
	
	
	
	 
}
