/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Term3Prac;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Question2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter secret number"));

		if (num % 2 == 0 && num % 7 == 0) {
			System.out.println("You can enter!");
		} else {
			System.out.println("You may not enter!");
		}
	}
}
