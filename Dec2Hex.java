package cse215;

import java.util.*;

public class Dec2Hex {

	private static Scanner in;
	private static String hexVal;
	
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		
		Dec2Hex Dec2Hex = new Dec2Hex();
		
		System.out.println("Dec2Hex: "+ Dec2Hex.hexVal);
		
		in.close();
	}
	
	public Dec2Hex() {
		
		Double decVal = in.nextDouble();
		in.nextLine();
				
		this.hexVal = this.convertD2H(decVal);
		
	}
	
	private String convertD2H(Double decVal) {
		
		String finaL_dec = "";
		


		int decVal_int = decVal.intValue();
		
		String remainder = "";
		
		int counter = 1;
		
		while (decVal_int/16 >= 0) {
			
			if (counter == 0)
				break;
			
			int to_add_int = (int) decVal_int%16;
			
			char the_char;
		
			switch (to_add_int) {
			
			case 10:
				the_char = 'A';
				break;
			case 11:
				the_char = 'B';
				break;
			case 12:
				the_char = 'C';
				break;
			case 13:
				the_char = 'D';
				break;
			case 14:
				the_char = 'E';
				break;
			case 15:
				the_char = 'F';
				break;
			default:
				the_char = (char) ('0' + to_add_int);
				break;
				
			
			}
			
			//System.out.println(the_char);

			//String to_add = Integer.toString((to_add_int));
			String to_add = "";
			
			to_add += the_char;
						
			remainder += to_add;

			
			if (decVal_int/16 == 0)
				counter = 0;
			
			decVal_int = decVal_int/16;
			
		}
		
		
		for (int i = remainder.length()-1; i >= 0; i--) {
			
			finaL_dec += remainder.charAt(i);
			
		}
		
								
		return finaL_dec;
	}

}
