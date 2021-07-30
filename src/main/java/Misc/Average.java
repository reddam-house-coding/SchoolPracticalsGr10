/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Average {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("How many nums?"));

		double sum = 0;
		double highest = 0;
		double lowest = 0;
		for (int i = 0; i < num; i++) {

			double numEntry = Double.parseDouble(JOptionPane.showInputDialog("How many nums?"));
			if (i == 0) {
				highest = numEntry;
				lowest = numEntry;
			}

			sum += numEntry;
			if (numEntry > highest) {
				highest = numEntry;
			}
			if (numEntry < lowest) {
				lowest = numEntry;
			}
		}

		System.out.println("Lowest: " + lowest);
		System.out.println("Average: " + sum / num);
		System.out.println("Highest: " + highest);
	}
}
