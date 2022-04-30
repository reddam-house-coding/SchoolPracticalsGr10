/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2021.JuneExam;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Factors {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter in a number"));

		int factorSum = 0;
		int numFactors = 0;

		System.out.print("The factors of " + num + " are: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + "\t");
				factorSum += i;
				numFactors++;
			}
		}

		System.out.println("");

		System.out.println("The sum of the factors (excl. the number itself) are: " + (factorSum - num));
		if (numFactors == 2) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is a composite number.");

			if (num == (factorSum - num)) {
				System.out.println(num + " is a perfect number.");
			} else {
				System.out.println(num + " is NOT a perfect number.");
			}
		}

	}
}
