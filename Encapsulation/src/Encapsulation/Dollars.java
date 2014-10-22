package Encapsulation;


public class Dollars {
	
	private int dollars = 0;
	private int kurs = 40;
	

	public int getDollars() {		
		return dollars;
	}
    
	public void setDollars(int dollars) {
				
		dollars = dollars / kurs;
		System.out.println("У вас всего " + dollars + "$");
	}
	
	
	
	 
}
