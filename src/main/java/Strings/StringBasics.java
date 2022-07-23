/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Cliftonb
 */
public class StringBasics {

	public static void main(String[] args) {
		String one = new String("aaadaaa");//120
		String two = new String("aaaxbbb");//100
		String three = one;

//		System.out.println(one == two);
//		System.out.println(one == three);
//		Object o = new Object();
//		Object o2 = new Object();
//		Object o3 = o;
//		System.out.println(o == o2);
//		System.out.println(o == o3);
		System.out.println(one.compareTo(two));
	}
}
