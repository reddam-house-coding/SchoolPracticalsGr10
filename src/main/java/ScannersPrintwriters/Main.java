/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScannersPrintwriters;

/**
 *
 * @author Cliftonb
 */
public class Main {

	public static void main(String[] args) {
		String books = BookManager.getBooks();

		System.out.println(books);

		BookManager.addBook("Hairier Porter", "Julius \"Malema\" Caesar");

		books = BookManager.getBooks();

		System.out.println(books);

	}

}
