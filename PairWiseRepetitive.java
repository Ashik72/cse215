package cse215;

import java.util.*;

public class PairWiseRepetitive {

	private static Scanner in;
	
	private String status;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		PairWiseRepetitive start = new PairWiseRepetitive();
		
		
		System.out.println(start.status);


	}
	
	public PairWiseRepetitive() {
		
		int input_num = this.input_num();
		
		while (input_num < 0) {
			System.out.println("The number should be a positive integer!");
			input_num = this.input_num();
		}
		
		int check_if_repetitive = this.check_if_repetitive(input_num);
		
		if (check_if_repetitive == 1)
			this.status = "Yes";
		else
			this.status = "No";
		
	}
	
	private int check_if_repetitive(int input_num) {
		
		String the_num_str = Integer.toString(input_num);
		
		int[] the_num_arr = new int[the_num_str.length()];
		
		if (the_num_arr.length % 2 != 0)
			return 0;
		
		for (int i = 0; i < the_num_arr.length; i++) {
			
			the_num_arr[i] = (int) the_num_str.charAt(i);
		}
	
		
		int i = 0;
		int j = 1;
		int count_loop = 0;
		
		while (i != the_num_arr.length-1) {
						
			if (count_loop%2 == 0) {
				
				if (the_num_arr[i] != the_num_arr[j])
					return 0;
			}

			
			i = j;
			j = i+1;
			count_loop = count_loop+1;
			
		}
		
		return 1;
		
	}
	
	private int input_num() {
		
		double get_number = in.nextDouble();
		in.nextLine();
		int return_number = (int) get_number;
		return return_number;
		
	}

}
