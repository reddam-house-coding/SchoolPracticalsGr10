/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2024.Term1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class VolumeCalc {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter in a radius");
		String input2 = JOptionPane.showInputDialog("Enter in a height");

		double radius = Double.parseDouble(input);
		double height = Double.parseDouble(input2);

		double volume = Math.PI * Math.pow(radius, 2) * height;

		volume *= 100;
		volume = Math.round(volume);
		volume /= 100;

		System.out.println("Spherical volume: " + volume + " cubic units");
	}
}
