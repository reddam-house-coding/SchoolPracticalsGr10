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
public class FiveChoices {

	public static void main(String[] args) {
		int choice = Integer.parseInt(JOptionPane.showInputDialog("1. A, 2. B, 3. C, 4. D, 5. E"));

		switch (choice) {
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			case 5:
				System.out.println("E");
				break;
			default:
				System.out.println("You did not choose correctly");
				break;
		}
	}
}
