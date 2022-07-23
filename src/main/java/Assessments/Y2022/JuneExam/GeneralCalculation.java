/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2022.JuneExam;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class GeneralCalculation {

	public static void main(String[] args) {
		int input1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
		int input2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));

		if (input1 > input2) {
			System.out.println("The larger number is :" + input1);
		} else {
			System.out.println("The larger number is :" + input2);
		}

		if (input1 % 2 == 0) {
			System.out.println("The first number is even");
		} else {
			System.out.println("The first number is odd");
		}

		System.out.println("The product of the two numbers is " + (input1 * input2));
	}
}
