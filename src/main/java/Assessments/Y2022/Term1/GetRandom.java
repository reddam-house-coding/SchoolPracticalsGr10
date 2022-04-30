/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2022.Term1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class GetRandom {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter in a word");

		int length = input.length();

		int random = (int) (Math.random() * length);

		System.out.println(input.charAt(random));
	}
}
