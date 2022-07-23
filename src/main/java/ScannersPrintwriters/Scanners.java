/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScannersPrintwriters;

import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class Scanners {

	public static void main(String[] args) {

		Scanner sc = new Scanner("Hello darkness my old friend").useDelimiter(" ");
		String token1 = sc.next();
		String token2 = sc.next();
		String token3 = sc.next();
		String token4 = sc.next();
//		String token5 = sc.next();

		System.out.println("Token 1:" + token1);
		System.out.println("Token 2:" + token2);
		System.out.println("Token 3:" + token3);
		System.out.println("Token 4:" + token4);
//		System.out.println("Token 5:" + token5);
	}
}
