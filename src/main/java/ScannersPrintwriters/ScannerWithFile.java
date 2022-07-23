/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScannersPrintwriters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class ScannerWithFile {

	public static void main(String[] args) {
		File f = new File("data//users.txt");

		try {
			Scanner fileSc = new Scanner(f);

			while (fileSc.hasNextLine()) {
				String line = fileSc.nextLine();

				Scanner lineSc = new Scanner(line).useDelimiter("#");

				String currentUsername = lineSc.next();
				String currentPass = lineSc.next();

				System.out.println("username: " + currentUsername);
				System.out.println("pass: " + currentPass);
			}

		} catch (FileNotFoundException ex) {
			Logger.getLogger(ScannerWithFile.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
