package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {
	public static void main(String[] args) {
		Random ran = new Random();
		String Lato="";
		 for (int random = 0; random < 6; random++) {
			 int number = ran.nextInt(6 - 1 + 1) + 1;
			 System.out.print(number);
				
				 System.out.println(number);
		 Lato+=" "+number;
		 
		 }
		 JOptionPane.showMessageDialog(null, Lato);
		 
		 
		 }      
		 

		
}
