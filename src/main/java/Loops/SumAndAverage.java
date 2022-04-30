/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author Cliftonb
 */
public class SumAndAverage {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 12; i++) {
			int multiple = 7 * i;
			sum += multiple;
		}

		System.out.println(sum);

	}
}
