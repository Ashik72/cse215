package cse215;

import javax.swing.JOptionPane;

public class lab_1c {

	public static void main(String[] args) {
		
		String input_weight_str = JOptionPane.showInputDialog(null, "Please enter your weight (KG):");
		String input_height_str = JOptionPane.showInputDialog(null, "Please enter your height (meters):");
		
		double input_weight = Double.parseDouble(input_weight_str);
		double input_height = Double.parseDouble(input_height_str);
		
		double the_bmi = input_weight / (input_height*input_height);
		
		
		int bmi_int = (int) the_bmi;
	
		//JOptionPane.showMessageDialog(null, bmi_int);

		
		if (bmi_int < 16)
			JOptionPane.showMessageDialog(null, "serious underweight");
		else if (bmi_int >= 16 && bmi_int <= 18)
			JOptionPane.showMessageDialog(null, "underweight");
		else if (bmi_int > 18 && bmi_int <= 24)
			JOptionPane.showMessageDialog(null, "normal weight");
		else if (bmi_int > 24 && bmi_int <= 29)
			JOptionPane.showMessageDialog(null, "overweight");
		else if (bmi_int > 29 && bmi_int <= 35)
			JOptionPane.showMessageDialog(null, "seriously overweight");
		else if (bmi_int > 35)
			JOptionPane.showMessageDialog(null, "gravely overweight");
		else
			JOptionPane.showMessageDialog(null, "invalid!");



	}

}
