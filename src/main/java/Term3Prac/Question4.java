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
public class Question4 {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Enter in your first word");
		String s2 = JOptionPane.showInputDialog("Enter in your first word");

		int choice = Integer.parseInt(JOptionPane.showInputDialog("Choice"));

		switch (choice) {
			case 1:
				System.out.print(s1.charAt(0) + "" + s2.charAt(s2.length() - 1));
				break;
			case 2:
				System.out.println(s1.toUpperCase() + " " + s2.toLowerCase());
				break;
			case 3:
				if (s1.equals(s2)) {
					System.out.println("They are equal");
				} else {
					System.out.println("They are not equal");
				}
		}

	}
}
