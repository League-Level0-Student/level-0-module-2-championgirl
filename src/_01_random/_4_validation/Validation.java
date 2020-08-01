//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		randomNumber = randomMaker.nextInt(6 - 1 + 1) + 1;
		
		for (int badger = 0; badger < 6; badger++) {
			randomNumber = randomMaker.nextInt(6 - 1 + 1) + 1;
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You are awesome!");
		} else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You are a hard worker!");
		} else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You are very nice!");
		} else if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "You are fabulous!");
		} else {
			JOptionPane.showMessageDialog(null, "You have a great future ahead of you!");
		}
		}

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	
	}
}
