package cse215;

import javax.swing.JOptionPane;

public class lab_1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String secret = JOptionPane.showInputDialog(null, "Enter the secret code to continue (Kung Fu Panda)",
				"Secret code needed (title)",
				JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "You have entered "+secret);
		
	}

}
