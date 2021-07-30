/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchCase;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class FiveChoicesIf {

	public static void main(String[] args) {
		int choice = Integer.parseInt(JOptionPane.showInputDialog("1 = A, 2 = B, 3 = C, 4 = D, 5 = E"));

		if (choice == 1) {
			System.out.println("A");
		} else if (choice == 2) {
			System.out.println("B");
		} else if (choice == 3) {
			System.out.println("C");
		} else if (choice == 4) {
			System.out.println("D");
		} else if (choice == 5) {
			System.out.println("E");
		}
	}
}
