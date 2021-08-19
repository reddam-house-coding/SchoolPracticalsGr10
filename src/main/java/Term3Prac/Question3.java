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
public class Question3 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter secret number"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter secret number"));

		int hcf = 1;
		for (int i = 1; i < num; i++) {
			if (num % i == 0 && num2 % i == 0) {
				hcf = i;
			}
		}

		System.out.println("HCF: " + hcf);
	}
}
