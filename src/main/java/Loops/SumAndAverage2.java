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
public class SumAndAverage2 {

	public static void main(String[] args) {

		int sum = 0;
		int highest = 0;
		for (int i = 0; i < 5; i++) {

			int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			sum += num;

			if (num > highest) {
				highest = num;
			}

		}

		System.out.println("Total:" + sum);
		System.out.println("Avg:" + sum / 5);
		System.out.println("Highest:" + highest);
	}
}
