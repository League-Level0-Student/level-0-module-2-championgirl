package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
	String years = JOptionPane.showInputDialog("Enter how old you are!");
	int old = Integer.parseInt( years);

	if(old>=18) {
		JOptionPane.showInputDialog(null,"Hurray! You are old enough to vote! Who should be the next President?");
	}

	if(old<18) {
		JOptionPane.showMessageDialog(null,"Nobody cares what you think!");
	}

}

}
