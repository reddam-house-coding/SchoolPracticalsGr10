/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class ForWhile {
    public static void main(String[] args) {
        

        
        int total = 0;
        
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number")); // initialisation
        while(num > 0){//continuation condition
            total = total + num;
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));//increment or change
        }
        
        System.out.println(total);
        
    }
}
