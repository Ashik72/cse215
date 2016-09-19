package cse215;

import javax.swing.JOptionPane;

public class lab_1d {

	public static void main(String[] args) {

		String number_str = JOptionPane.showInputDialog(null, "Your grade:");
		
		int number_st = Integer.parseInt(number_str);
		
		int switch_int = 0;
		
		if (number_st > 100 || number_st < 0)
			switch_int = 1;
		else if (number_st >= 90 && number_st <= 99)
			switch_int = 2;
		else if (number_st >= 80 && number_st <= 89)
			switch_int = 3;
		else if (number_st >= 70 && number_st <= 79)
			switch_int = 4;
		else if (number_st >= 60 && number_st <= 69)
			switch_int = 5;
		else if (number_st >= 0 && number_st <= 59)
			switch_int = 6;
		else
			switch_int = 1;
		
		
		switch (switch_int) {
		
		case 1:
			JOptionPane.showMessageDialog(null, "Wrong Input");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "A");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "B");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "C");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "D");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "F");
			break;	
		default:
			JOptionPane.showMessageDialog(null, "Wrong Input");
			break;

		
		}
		
	}

}
