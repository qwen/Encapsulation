package Encapsulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;




public class Encapsulation {
	
	static int rub;
	static int t;
	static Dollars dollars = new Dollars();
	
	public static void main(String[] args) throws Throwable{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Введите сколько у вас рублей ");
		rub = Integer.parseInt(reader.readLine());
		
		
		t = dollars.setDollars(rub);
		
		System.out.println("У вас всего " + t + "$");
	}

}
