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
public class GenerateCode {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        
        int rand = (int)(Math.random()*90 + 10);
        
        String code = "" + name.charAt(0) + name.charAt(1)  + name.charAt(name.length()-1) + rand;
        
        System.out.println(code);
    }
}
