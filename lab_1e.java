package cse215;

import javax.swing.JOptionPane;

public class lab_1e {

	public static void main(String[] args) {

		String year_str = JOptionPane.showInputDialog(null, "Year:");
		
		int year_int = Integer.parseInt(year_str);
		
		if (((year_int % 4 == 0) && !(year_int % 100 == 0)) || (year_int % 400 == 0))
			JOptionPane.showMessageDialog(null, "Leap Year!");
		else
			JOptionPane.showMessageDialog(null, "Not Leap Year!");
		
	}

}
