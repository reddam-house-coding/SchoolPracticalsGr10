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
public class VolumeCalc {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter in a radius");

		double radius = Double.parseDouble(input);

		double volume = (4 / 3.0) * (Math.PI * Math.pow(radius, 3));

		volume *= 1000;
		volume = Math.round(volume);
		volume /= 1000;

		System.out.println("Spherical volume: " + volume + " cubic units");
	}
}
