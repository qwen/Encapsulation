package Encapsulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;




public class Encapsulation {
	
	static int rub;
	static Dollars dollars = new Dollars();
	
	public static void main(String[] args) throws Throwable{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("¬ведите сколько у вас рублей ");
		rub = Integer.parseInt(reader.readLine());
		
		
		dollars.setDollars(rub);
		
		System.out.println("3 " + dollars);
	}

}
