/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assessments.Y2024.Term1;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class Initials {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Enter name 1");
        String name2 = JOptionPane.showInputDialog("Enter name 2");
        String name3 = JOptionPane.showInputDialog("Enter name 3");
        
        String initials = "" + name1.charAt(0) + name2.charAt(0) + name3.charAt(0);
        
        System.out.println(initials);
    }
}
