/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2021.Term3;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Question1 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter num1"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter num2"));

			double answer = 0;

			char choice = JOptionPane.showInputDialog("Choose: multiply (m), divide (d), add (a), subtract (s)").charAt(0);

			switch (choice) {
				case 'm':
					answer = num1 * num2;
					break;
				case 'd':
					answer = num1 / num2;
					break;
				case 'a':
					answer = num1 + num2;
					break;
				default:
					answer = num1 - num2;
					break;
			}

			System.out.println("Answer: " + answer);

		}
	}
}
