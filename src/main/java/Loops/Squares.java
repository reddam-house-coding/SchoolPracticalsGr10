/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Squares {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter name");

		for (int i = 0; i <= name.length(); i++) {
			System.out.println(name.charAt(i));
		}
	}
}
