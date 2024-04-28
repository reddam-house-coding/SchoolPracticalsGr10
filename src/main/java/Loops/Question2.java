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

		int num = Integer.parseInt(JOptionPane.showInputDialog("How many test?"));
                int sum = 0;
                

			int testMark = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
			sum += testMark;

		}

		System.out.println("Avg:" + sum / num);
                
                
                double sum2 = 0;
                for(int i = 5; i <= 25; i+=5){
                    double area = Math.PI * 0.5 * Math.pow(i,2);
                    sum2 += area;
                }
                System.out.println("Area: " + sum21 );
	}
}
