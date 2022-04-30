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
public class HotelCalc {

	public static void main(String[] args) {
		String inputNights = JOptionPane.showInputDialog("How many nights will you be staying?");
		String inputAdults = JOptionPane.showInputDialog("How many adults?");
		String inputChildren = JOptionPane.showInputDialog("How many children?");

		int numNights = Integer.parseInt(inputNights);
		int numAdults = Integer.parseInt(inputAdults);
		int numChildren = Integer.parseInt(inputChildren);

		double totalCost = numNights * numAdults * 120.75 + numNights * numChildren * 87.45;

		System.out.println("Total cost for " + numNights + " nights is : R" + totalCost);
	}
}
