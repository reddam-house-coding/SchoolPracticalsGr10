/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScannersPrintwriters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class BookManager {

	private static String filepath = "data\\books.txt";

	public static String getBooks() {
		String output = "";
		try {
			File f = new File(filepath);
			Scanner fileSc = new Scanner(f);
			while (fileSc.hasNextLine()) {
				String line = fileSc.nextLine();

				//add code to process each line
				Scanner lineSc = new Scanner(line).useDelimiter("#");

				//YOUR CODE STARTS HERE
				String name = lineSc.next();
				String author = lineSc.next();
				output += "BOOK: " + name + "   AUTHOR: " + author + "\n";
				//YOUR CODE ENDS HERE

				lineSc.close();
			}
			fileSc.close();

		} catch (FileNotFoundException ex) {
			System.out.println("File not found");
		}
		return output;
	}

	public static String getAuthors() {
		String output = "";
		try {
			File f = new File(filepath);
			Scanner fileSc = new Scanner(f);
			while (fileSc.hasNextLine()) {
				String line = fileSc.nextLine();

				//add code to process each line
				Scanner lineSc = new Scanner(line).useDelimiter("#");

				//YOUR CODE STARTS HERE
				String name = lineSc.next();
				String author = lineSc.next();
				output += author + "\n";
				//YOUR CODE ENDS HERE

				lineSc.close();
			}
			fileSc.close();

		} catch (FileNotFoundException ex) {
			System.out.println("File not found");
		}
		return output;
	}

	public static void addBook(String name, String author) {
		try {
			FileWriter fw = new FileWriter(filepath, true);
			PrintWriter pw = new PrintWriter(fw);

			//YOUR CODE STARTS HERE
			pw.println(name + "#" + author);
			//YOUR CODE ENDS HERE

			pw.close();
		} catch (IOException ex) {
			System.out.println("File not found");
		}
	}

}
