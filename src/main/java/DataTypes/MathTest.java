/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypes;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class MathTest {
    public static void main(String[] args) {
        
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter your radius: "));
        
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.println("Your area is: " + area);
        
    }
}
