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
public class InterestCalculation {

	public static void main(String[] args) {
		int principal = Integer.parseInt(JOptionPane.showInputDialog("Enter in the principal amount"));

		int interest = (int) (Math.random() * 7 + 2);

		double annuity = Math.round(principal * Math.pow(1 + interest / 100.0, 8));
	}
}
