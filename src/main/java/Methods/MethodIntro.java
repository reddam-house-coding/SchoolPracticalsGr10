/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author Cliftonb
 */
public class MethodIntro {

	public static int num = 0;

	public static void main(String[] args) {
		int num2 = 5;
		System.out.println("num: " + num + " and num2 : " + num2);
	}

	public static int getSome() {
		int num3 = num + 2;
		return num3;
	}

}
