/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class NumberDataTypes {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("enter a number");
		String input2 = JOptionPane.showInputDialog("enter a number");

		int num = Integer.parseInt(input);
		double num2 = Double.parseDouble(input2);

		System.out.println(num);
		System.out.println(num2);
	}
}
