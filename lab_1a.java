package cse215;

import javax.swing.JOptionPane;

public class lab_1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ques;
		ques = JOptionPane.showInputDialog(null, "What is your name?");
		
		JOptionPane.showMessageDialog(null, "Hello "+ ques);
		
	}

}
