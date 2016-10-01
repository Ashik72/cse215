package cse215;

import java.util.*;

public class CountOccurrence {
	
	private static Scanner in;
	private int totalOcc;
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		System.out.println("The String:");
		String the_string = in.nextLine();
		
		CountOccurrence start_occ = new CountOccurrence(the_string);
		System.out.println("Total Occurrence: "+ start_occ.totalOcc);

	}
	
	public CountOccurrence(String the_string) {
		
		char get_the_char = this.which_char();
		int totalOcc = this.totalOccurrence(the_string, get_the_char);
		
		//System.out.println("Total Occurrence: "+totalOcc);
		this.totalOcc = totalOcc;
		
	}
	
	private char which_char() {
	
		System.out.println("The char:");

		String the_char_str = in.nextLine();
		
		char the_char = the_char_str.charAt(0);
		
		return the_char;
		
	}
	
	private int totalOccurrence(String the_string, char the_char) {
		
		int total = 0;
		
	
		
		for(char t: the_string.toCharArray()) {
			
			if (t == the_char)
				total = total + 1;
		}
		
		
		return total;
		
	}
	

}
