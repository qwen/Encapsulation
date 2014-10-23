package Encapsulation;


public class Dollars {
	
	private int dollars = 0;
	private int kurs = 40;
	
	

	public int getDollars() {		
		return dollars;
	}

	public int setDollars(int dollars) {
			
		dollars = dollars / kurs;
		
		return dollars;
	}
	
	
	
	 
}
