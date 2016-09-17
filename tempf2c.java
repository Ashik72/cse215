package cse215;
import java.util.Scanner;


public class tempf2c {

	public static void main(String[] args) {

		
		tempf2c i1 = new tempf2c();
				
	}
	
	
	private void f2c () {
		
		System.out.println("Fahrenheit:");

		double f = getUserInp();
		
		double c = (5.0/9.0)*(f - 32.0);
		
		System.out.println("Celcius: "+c);

		
	}
	
	private void c2f() {
		 
		
		System.out.println("Celcius:");

		double c = getUserInp();
		
		double f = (c * (9.0/5.0))+32;
		
		System.out.println("Fahrenheit: "+f);
		
	}
	
	
	public tempf2c() {
		
		
		
			System.out.println("You want to convert - (1) Fahrenheit to Celcius | (2) Celcius to Fahrenheit ?");
		
		Scanner choice = new Scanner(System.in);
		
		char user_choice = choice.next().charAt(0);
		
		int choice_int = Character.getNumericValue(user_choice);
				
		if (choice_int == 1) 
			this.f2c();
		else if (choice_int == 2)
			this.c2f();
		
		
	}
	
	private double getUserInp() {
		
		Scanner uInp = new Scanner(System.in);
		
		double inputVal = uInp.nextDouble();
		
		uInp.close();
		
		return inputVal;
	
		
	}
	

	

}
