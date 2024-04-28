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
public class BMICalculator {
    public static void main(String[] args) {
        String heightInput = JOptionPane.showInputDialog("Enter your height in meters");
        String weightInput = JOptionPane.showInputDialog("Enter your weight in KG's");
        
        JOptionPane.showInputDialog("sefsdfsdffsdfsd");
        
        double height = Double.parseDouble(heightInput);
        double weight = Double.parseDouble(weightInput);
        
        double bmi = weight / Math.pow(height, 2);
        
        System.out.println(bmi);
    }
}
