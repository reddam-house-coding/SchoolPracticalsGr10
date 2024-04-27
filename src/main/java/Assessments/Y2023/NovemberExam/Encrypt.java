/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2023.NovemberExam;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Encrypt {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("enter a word");

        String output = "";
        boolean lower = false;
        for (int i = 0; i < input.length(); i++) {

            char current = Character.toUpperCase(input.charAt(i));
            if (!Character.isDigit(current)) {

                switch (current) {
                    case 'A':
                        current = '@';
                        break;
                    case 'E':
                        current = '3';
                        break;
                    case 'I':
                        current = '1';
                        break;
                    case 'O':
                        current = '0';
                        break;
                    case 'U':
                        current = '#';
                        break;
                    default:

                        if (Character.isWhitespace(current)) {
                            current = '_';
                        } else {
                            lower = !lower;
                            if (lower) {
                                current = Character.toLowerCase(current);
                            }
                        }
                }

                output += current;
            }

        }

        System.out.println(output);
    }

}
