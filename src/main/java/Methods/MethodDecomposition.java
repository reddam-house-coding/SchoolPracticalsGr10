/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class MethodDecomposition {

	public static void main(String[] args) {

		double shoePrice = Double.parseDouble(JOptionPane.showInputDialog("Enter in the shoe price"));
		double shoePriceVAT = addVAT(shoePrice);

		double shirtPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter in the shoe price"));
		double shirtPriceVAT = addVAT(shirtPrice);

		double sockPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter in the shoe price"));
		double sockPriceVAT = addVAT(sockPrice);

		sayHello();

		print("woooo!!");
	}

	public static double addVAT(double price) {
		return price * 1.15;
	}

	public static void print(String message) {
		System.out.println(message);
	}

	public static void print(String message, String message2) {
		System.out.println(message);
	}

	public static void add(int num, double num2) {
		//do something
	}

	public static void add(double num2, int num) {
		//do something
	}

	public static void sayHello() {
		System.out.println("Hello");
	}
}
